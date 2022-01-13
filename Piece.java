package BoardGames;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class Piece extends JPanel{
    ImageIcon chessPiece;
    ImageIcon black = new ImageIcon("BoardGames/Images/checkers_black.png");
    final int WIDTH = black.getIconWidth();
    final int HEIGHT = black.getIconHeight();
    final int MARGIN = (Main.tilesize - WIDTH) / 2;
    Point imageCorner;
    Point pieceCorner;
    Point prevP;

    public Piece(int x, int y, ImageIcon icon){
        chessPiece = icon;
        imageCorner = new Point(MARGIN, MARGIN);
        pieceCorner = new Point(x, y);
        Click click = new Click();
        Drag drag = new Drag();
        this.addMouseMotionListener(drag);
        this.setBounds(pieceCorner.x, pieceCorner.y, Main.tilesize, Main.tilesize);
        this.addMouseListener(click);
        this.setOpaque(false);
    }

    private class Click extends MouseAdapter{
        public void mousePressed(MouseEvent e) {
            if(e.getButton() == 3){
                Piece p = (Piece) e.getSource();
                Pieces ps = (Pieces) p.getParent();
                ps.remove(p);
                ps.repaint();
            }
            prevP = e.getPoint();
            imageCorner.setLocation(MARGIN + 5, MARGIN - 5);
            repaint();
        }
        public void mouseReleased(MouseEvent e){
            imageCorner.setLocation(MARGIN, MARGIN);
            int newX = (int)Math.floor((pieceCorner.x + Main.tilesize/2) / Main.tilesize);
            int newY = (int)Math.floor((pieceCorner.y + Main.tilesize/2) / Main.tilesize);
            pieceCorner.setLocation(newX * Main.tilesize, newY * Main.tilesize);
            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(pieceCorner.x < 0){
            pieceCorner.x = 0;
        }
        if(pieceCorner.y < 0){
            pieceCorner.y = 0;
        }
        if(pieceCorner.x > Main.boardsize - Main.tilesize){
            pieceCorner.x = Main.boardsize - Main.tilesize;
        }
        if(pieceCorner.y > Main.boardsize - Main.tilesize){
            pieceCorner.y = Main.boardsize - Main.tilesize;
        }
        super.setBounds(pieceCorner.x, pieceCorner.y, Main.tilesize, Main.tilesize);
        chessPiece.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }

    private class Drag extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();
                pieceCorner.translate( 
                    (int)(currentPt.getX() - prevP.getX()),
                    (int)(currentPt.getY() - prevP.getY())
                );
            repaint();
        }
    }
}

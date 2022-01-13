package BoardGames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;

public class Main {
    //Setting up variables used in program
    static ImageIcon black = new ImageIcon("BoardGames/Images/checkers_black.png");
    final static int width = 1100;
    final static int height = 850;
    final static int boardsize = 600;
    final static int tilesize = boardsize / 8;
    final static int sidemargin = (width - boardsize) / 2;
    final static int topmargin = (height - boardsize) / 2;
    final static int imgSize = black.getIconWidth();
    final static Color darkTileColor = new Color(107, 41, 41);
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        // Frame contains 5 panels
        ChessBoard board = new ChessBoard();
        LeftPanel lpanel = new LeftPanel();
        RightPanel rpanel = new RightPanel();
        TopPanel tpanel = new TopPanel();
        BotPanel ppanel = new BotPanel();

        JLayeredPane chessb = new JLayeredPane();
        chessb.setBounds(0,0,boardsize,boardsize);
        chessb.setPreferredSize(new Dimension(boardsize,boardsize));
        board.setBounds(0,0,boardsize,boardsize);
        chessb.add(board, 0, 0);

        
        frame.add(chessb, BorderLayout.CENTER);
        frame.add(lpanel, BorderLayout.WEST);
        frame.add(rpanel, BorderLayout.EAST);
        frame.add(tpanel, BorderLayout.NORTH);
        frame.add(ppanel, BorderLayout.SOUTH); 
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
    }

}

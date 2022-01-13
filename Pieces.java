package BoardGames;

import java.awt.*;

import javax.swing.*;

public class Pieces extends JPanel{
    static ImageIcon black = new ImageIcon("BoardGames/Images/checkers_black.png");
    static ImageIcon white = new ImageIcon("BoardGames/Images/checkers_white.png");
    static ImageIcon b_bishop = new ImageIcon("BoardGames/Images/b_bishop.png");
    static ImageIcon b_king = new ImageIcon("BoardGames/Images/b_king.png");
    static ImageIcon b_knight = new ImageIcon("BoardGames/Images/b_knight.png");
    static ImageIcon b_pawn = new ImageIcon("BoardGames/Images/b_pawn.png");
    static ImageIcon b_queen = new ImageIcon("BoardGames/Images/b_queen.png");
    static ImageIcon b_rook = new ImageIcon("BoardGames/Images/b_rook.png");
    static ImageIcon w_bishop = new ImageIcon("BoardGames/Images/w_bishop.png");
    static ImageIcon w_king = new ImageIcon("BoardGames/Images/w_king.png");
    static ImageIcon w_knight = new ImageIcon("BoardGames/Images/w_knight.png");
    static ImageIcon w_pawn = new ImageIcon("BoardGames/Images/w_pawn.png");
    static ImageIcon w_queen = new ImageIcon("BoardGames/Images/w_queen.png");
    static ImageIcon w_rook = new ImageIcon("BoardGames/Images/w_rook.png");
    Point imageCorner;
    Point prevP; 
    private static ImageIcon[] b_chesspieces = {b_rook, b_knight, b_bishop, b_queen, b_king, b_bishop, b_knight, b_rook, b_pawn, b_pawn,b_pawn,b_pawn,b_pawn,b_pawn,b_pawn,b_pawn};
    private static ImageIcon[] w_chesspieces = {w_rook, w_knight, w_bishop, w_queen, w_king, w_bishop, w_knight, w_rook, w_pawn, w_pawn,w_pawn,w_pawn,w_pawn,w_pawn,w_pawn,w_pawn};

    public Pieces (int amount, int row, ImageIcon icon) {
        this.setLayout(null);
        for(int i = 0; i < amount; i++){
            Piece p = new Piece(i * Main.tilesize, row * Main.tilesize, icon);
            p.setPreferredSize(new Dimension(Main.tilesize, Main.tilesize));
            this.add(p);
        }
        this.setOpaque(false);
    }

    public Pieces(){
        this.setLayout(null);
        for(int i = 0; i < 8; i++){
            Piece b = new Piece(i * Main.tilesize, 0, b_chesspieces[i]);
            Piece w = new Piece(i * Main.tilesize, 7 * Main.tilesize, w_chesspieces[i]);
            this.add(b);
            this.add(w);
        }
        for(int i = 0; i < 8; i++){
            Piece b = new Piece(i * Main.tilesize, 1 * Main.tilesize, b_chesspieces[i+8]);
            Piece w = new Piece(i * Main.tilesize, 6 * Main.tilesize, w_chesspieces[i+8]);
            this.add(b);
            this.add(w);
        }
        this.setOpaque(false);
        
    }
}

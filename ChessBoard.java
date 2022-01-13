package BoardGames;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class ChessBoard extends JPanel{

    private static JPanel[][] boardTiles = new JPanel[8][8];

    public final static void fillBoard(){
        for(int y = 0; y < 8; y++){
            for(int x = 0; x < 8; x++){
                JPanel tile = new JPanel();
                tile.setPreferredSize(new Dimension(Main.tilesize, Main.tilesize));
                if((x % 2 == 1 && y % 2 == 1) || (x % 2 == 0 && y % 2 == 0)){
                    tile.setBackground(Color.white);
                }
                else{
                    tile.setBackground(Main.darkTileColor);
                }
                boardTiles[y][x] = tile;
            }
        }
    }

    public ChessBoard() {
        fillBoard();
        this.setBackground(Color.red);
        this.setPreferredSize(new Dimension(Main.boardsize, Main.boardsize));
        this.setLayout(new GridLayout(8, 8));
        for(int y = 0; y < 8; y++){
            for(int x = 0; x < 8; x++){
                this.add(boardTiles[y][x]);
            }
        }
    } 
}

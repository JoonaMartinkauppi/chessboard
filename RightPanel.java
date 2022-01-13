package BoardGames;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

public class RightPanel extends JPanel{
    static ImageIcon black = new ImageIcon("BoardGames/Images/checkers_black.png");
    static ImageIcon white = new ImageIcon("BoardGames/Images/checkers_white.png");
    
    public RightPanel(){
        JLabel text1 = new JLabel("<html>How many black<br>checkers pieces?(1-24)</html>");
        text1.setFont(new Font("Serif", Font.BOLD, 20));
        JTextField field1 = new JTextField();
        field1.setPreferredSize(new Dimension(50,20));
        JButton button = new JButton("Add");

        JLabel text2 = new JLabel("<html>How many white<br>checkers pieces?(1-24)</html>");
        text2.setFont(new Font("Serif", Font.BOLD, 20));
        JTextField field2 = new JTextField();
        field2.setPreferredSize(new Dimension(50,20));
        JButton button2 = new JButton("Add");

        JButton button3 = new JButton("Set up a chess game");

        JButton button4 = new JButton("Clear board");


        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String number = field1.getText();
                try {
                    int nb = Integer.parseInt(number);
                    JPanel jp = (JPanel) button.getParent().getParent();
                    JLayeredPane jlp = (JLayeredPane) jp.getComponents()[0];
                    if(nb > 0 && nb < 25){
                        System.out.println("Add " + nb + " black pieces!");
                        Pieces bpieces = new Pieces(nb, 0, black);
                        bpieces.setBounds(0,0,Main.boardsize,Main.boardsize);
                        jlp.add(bpieces, 1, 0);
                    }
                    if(nb > 8 && nb < 25){
                        System.out.println("Add " + nb + " black pieces!");
                        Pieces bpieces = new Pieces(nb-8, 1, black);
                        bpieces.setBounds(0,0,Main.boardsize,Main.boardsize);
                        jlp.add(bpieces, 1, 0);
                    }
                    if(nb > 16 && nb < 25){
                        System.out.println("Add " + nb + " black pieces!");
                        Pieces bpieces = new Pieces(nb-16, 2, black);
                        bpieces.setBounds(0,0,Main.boardsize,Main.boardsize);
                        jlp.add(bpieces, 1, 0);
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                field1.setText("");

            }
        });
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String number = field2.getText();
                try {
                    int nb = Integer.parseInt(number);
                    JPanel jp = (JPanel) button.getParent().getParent();
                    JLayeredPane jlp = (JLayeredPane) jp.getComponents()[0];
                    if(nb > 0 && nb < 25){
                        System.out.println("Add " + nb + " white pieces!");
                        Pieces bpieces = new Pieces(nb, 7, white);
                        bpieces.setBounds(0,0,Main.boardsize,Main.boardsize);
                        jlp.add(bpieces, 1, 0);
                    }
                    if(nb > 8 && nb < 25){
                        System.out.println("Add " + nb + " black pieces!");
                        Pieces bpieces = new Pieces(nb-8, 6, white);
                        bpieces.setBounds(0,0,Main.boardsize,Main.boardsize);
                        jlp.add(bpieces, 1, 0);
                    }
                    if(nb > 16 && nb < 25){
                        System.out.println("Add " + nb + " black pieces!");
                        Pieces bpieces = new Pieces(nb-16, 5, white);
                        bpieces.setBounds(0,0,Main.boardsize,Main.boardsize);
                        jlp.add(bpieces, 1, 0);
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                field2.setText("");

            }
        });

        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel jp = (JPanel) button.getParent().getParent();
                JLayeredPane jlp = (JLayeredPane) jp.getComponents()[0];
                Pieces bpawns = new Pieces();
                bpawns.setBounds(0,0,Main.boardsize,Main.boardsize);
                jlp.add(bpawns, 1, 0);
                System.out.println("Setting up a chess game!"); 

            }
        });

        button4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel jp = (JPanel) button.getParent().getParent();
                JLayeredPane jlp = (JLayeredPane) jp.getComponents()[0];
                jlp.removeAll();
                ChessBoard board = new ChessBoard();
                board.setBounds(0,0,Main.boardsize,Main.boardsize);
                jlp.add(board, 0 ,0);
                jlp.repaint();
                System.out.println("Clearing board!"); 

            }
        });

        this.setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(Main.sidemargin,Main.boardsize));
        this.add(text1);
        this.add(field1);
        this.add(button);
        this.add(text2);
        this.add(field2);
        this.add(button2);
        this.add(button3);
        this.add(button4);
    }
    
}

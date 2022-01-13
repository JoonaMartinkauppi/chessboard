package BoardGames;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;

public class LeftPanel extends JPanel{
    public LeftPanel () {
        this.setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(Main.sidemargin,Main.boardsize));
        JLabel text1 = new JLabel("<html>Instructions:<br>Add pieces to board<br>Move pieces with mouse<br>Right-click removes piece</html>");
        text1.setFont(new Font("Serif", Font.BOLD, 20));
        this.add(text1);
    }

}

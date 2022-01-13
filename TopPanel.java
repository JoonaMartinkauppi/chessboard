package BoardGames;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class TopPanel extends JPanel {
    public TopPanel(){
        this.setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(Main.width, Main.topmargin));
        JLabel text1 = new JLabel("Boardgame sandbox");
        text1.setFont(new Font("Serif", Font.BOLD, 30));
        this.add(text1);
    }
}

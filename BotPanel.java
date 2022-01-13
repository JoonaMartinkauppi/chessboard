package BoardGames;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class BotPanel extends JPanel {
    public BotPanel(){
        this.setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(Main.width, Main.topmargin));
    }
}

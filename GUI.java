import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI extends JFrame {
    private ArrayList<Player> Team;
    private JTextArea statsArea;

    public GUI(ArrayList<Player> Team) {
        this.Team = Team;
        setTitle("Basketball Team Stats");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        statsArea = new JTextArea();
        statsArea.setEditable(false);
        add(statsArea, BorderLayout.CENTER);
    }
}

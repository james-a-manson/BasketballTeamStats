import java.util.ArrayList;

public class BasketballTeamStats {
    public static void main(String[] args) {
        ArrayList<Player> Team = new ArrayList<Player>();
        GUI gui = new GUI(Team);
        gui.setVisible(true);
    }
}

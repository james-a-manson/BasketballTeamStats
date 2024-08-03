public class Player {
    private String firstName;
    private String lastName;
    private int totalPoints;
    private int totalFT;
    private int total2PT;
    private int total3PT;
    private int gamesPlayed;

    public Player(String firstName, String lastName, int totalPoints, int total2PT, int total3PT, int totalFT, int gamesPlayed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalPoints = totalPoints;
        this.total2PT = total2PT;
        this.total3PT = total3PT;
        this.totalFT = totalFT;
        this.gamesPlayed = gamesPlayed;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getTotalFT() {
        return totalFT;
    }

    public int getTotal2PT() {
        return total2PT;
    }

    public int getTotal3PT() {
        return total3PT;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void addGame(int points, int twoPT, int threePT, int FT) {
        totalPoints += points;
        total2PT += twoPT;
        total3PT += threePT;
        totalFT += FT;
        gamesPlayed++;
    }

    public double getPPG() {
        return (double) totalPoints / gamesPlayed;
    }

    public double getFTPG() {
        return (double) totalFT / gamesPlayed;
    }

    public double get2PTPG() {
        return (double) total2PT / gamesPlayed;
    }

    public double get3PTPG() {
        return (double) total3PT / gamesPlayed;
    }
}
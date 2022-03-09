public class GameManager {

    protected int[] speeds;

    public int[] getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int[] speeds) {
        this.speeds = speeds;
    }

    public GameManager(Game game) {
        this.game = game;
    }

    Game game = new Game(true);


    public int rounds(int[] speeds) {

        int sum = 0;

        for (int round : speeds) {
            if (game.isFailed(round) == false) {
                sum++;
            } else {
               round++;
            }
        } return sum;
    }
}


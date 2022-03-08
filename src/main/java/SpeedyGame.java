public class SpeedyGame extends Game {
    protected int maxSpeed;

    public SpeedyGame(boolean isGreenLight, int maxSpeed) {
        super(true);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        maxSpeed = newMaxSpeed;
    }

    public boolean maxFailed(int speed) {

        boolean maxFailed = false;
        if (speed != maxSpeed){

            maxFailed = true;

        }
        return maxFailed;


    }
}

public class SpeedyGame extends Game {
    private int MaxSpeed;

    public SpeedyGame(boolean isGreenLight, int MaxSpeed) {
        super(isGreenLight);
        this.MaxSpeed = MaxSpeed;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        MaxSpeed = newMaxSpeed;
    }

    @Override
    public boolean isFailed(int speed) {

        boolean maxFailed = false;
        if (getSpeed() == false) {
            if (speed > MaxSpeed) {


            }
            return true;
        } else {
            return false;


        }
    }
}

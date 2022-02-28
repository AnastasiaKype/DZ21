public class Game {

    private boolean isGreenLight;

    public Game(boolean isGreenLight) {
        this.isGreenLight = false;
    }

    public boolean getSpeed() {
        return isGreenLight;
    }

    public void setSpeed(boolean newLight) {
        isGreenLight = newLight;
    }

    public boolean isFailed(int speed) {

        boolean isFailed = false;
        if (isGreenLight = false) {

            if (speed != 0) {

                isFailed = true;

            }

        }  return true;

    }
}

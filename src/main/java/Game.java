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


        if (isGreenLight == false) {

            if (speed != 0) {

            }
            return true;

        } else {
            return false;
        }

    }
}

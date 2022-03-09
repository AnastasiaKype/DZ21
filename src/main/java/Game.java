public class Game {

    private boolean isGreenLight;

    protected Game() {
        this.isGreenLight = false;
    }

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public boolean getSpeed() {
        return isGreenLight;
    }

    public void setSpeed(boolean newLight) {
        isGreenLight = newLight;
    }

    public boolean isFailed(int speed) {

        if (isGreenLight == false) {
            if (speed !=0){

            } return true;
        } else {
            return false;
        }

    }
}

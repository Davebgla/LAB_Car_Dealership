package Parts;

public class Fittings {

    private int numOfSeats;
    private boolean satNav;
    private String soundSystem;

    public Fittings(int numOfSeats, boolean satNav, String soundSystem) {
        this.numOfSeats = numOfSeats;
        this.satNav = satNav;
        this.soundSystem = soundSystem;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public boolean isSatNav() {
        return satNav;
    }

    public void setSatNav(boolean satNav) {
        this.satNav = satNav;
    }

    public String getSoundSystem() {
        return soundSystem;
    }

    public void setSoundSystem(String soundSystem) {
        this.soundSystem = soundSystem;
    }
}

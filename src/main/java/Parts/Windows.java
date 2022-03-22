package Parts;

public class Windows {

    private int numOfWindows;
    private boolean tinted;

    public Windows(int numOfWindows, boolean tinted) {
        this.numOfWindows = numOfWindows;
        this.tinted = tinted;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public boolean isTinted() {
        return tinted;
    }

    public void setTinted(boolean tinted) {
        this.tinted = tinted;
    }
}

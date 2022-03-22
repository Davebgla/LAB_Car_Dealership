package Parts;

public class Wheels {

    private boolean alloys;
    private String tyreType;

    public Wheels(boolean alloys, String tyreType) {
        this.alloys = alloys;
        this.tyreType = tyreType;
    }

    public boolean isAlloys() {
        return alloys;
    }

    public void setAlloys(boolean alloys) {
        this.alloys = alloys;
    }

    public String getTyreType() {
        return tyreType;
    }

    public void setTyreType(String tyreType) {
        this.tyreType = tyreType;
    }
}

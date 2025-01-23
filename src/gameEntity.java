public class gameEntity {
    private String name;
    private int XP;

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String info() {
        return "Name" + this.name + " XP " + this.XP;
    }
}

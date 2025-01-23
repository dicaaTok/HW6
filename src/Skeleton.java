public class Skeleton extends Boss {
    private int Arrom;

    public Skeleton(String name, int Xp, weapon weapon, int Arrom) {
        super(name, Xp, weapon);
        this.Arrom = Arrom;
    }

    public int getArrom() {
        return Arrom;
    }

    public void setArrom(int arrom) {
        Arrom = arrom;
    }

    public String info() {
        return super.info() + "Arrom" + getArrom();
    }
}

public class Boss extends gameEntity {
    private weapon weapon;

    public Boss(String name, int Xp, weapon weapon) {
        super();
        this.weapon = weapon;
        super.setName(name);
        super.setXP(Xp);

    }

    public weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(weapon weapon) {
        this.weapon = weapon;
    }

    public String info() {
        return "boss " + super.info();
    }
}

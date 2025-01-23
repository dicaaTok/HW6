public class weapon {
    private WeaponType typeOfWeapon;
    private String nameWeapon;

    public WeaponType getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(WeaponType typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public weapon(WeaponType typeOfWeapon, String nameWeapon) {
        this.typeOfWeapon = typeOfWeapon;
        this.nameWeapon = nameWeapon;
    }

    public String info() {
        return " Weapon " + this.nameWeapon + " Type weapon " + this.typeOfWeapon;
    }
}

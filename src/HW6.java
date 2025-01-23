//Создайте перечисление WeaponType, в котором перечислите три типа оружия.+
//Создайте класс Weapon с приватными полями для хранения типа оружия и названия оружия, а также добавьте методы доступа (геттеры и сеттеры) к этим полям.
//Создайте класс GameEntity для представления игровых сущностей, выделив общие поля, присущие как боссам, так и героям, и добавьте методы доступа к этим полям.
//1Создайте класс Boss, который наследуется от GameEntity, и добавьте в него поле сложного типа Weapon (для назначения оружия боссу), а также методы доступа к этому полю.
//В классе Main (класс в котором есть запускаемый метод main) создайте экземпляр босса и установите ему все необходимые свойства.
//---Реализуйте метод printInfo() в классе Boss для печати информации о боссе.
//Создайте класс Skeleton, который также наследуется от класса Boss.
//Добавьте в класс Skeleton поле для хранения количества стрел и методы доступа к этому полю.
//Переопределите метод printInfo() в классе Skeleton.
//В методе main создайте и заполните данными два экземпляра Skeleton, а затем выведите всю информацию о скелетах.
public class HW6 {
    public static void main(String[] args) {
        weapon bossWeapon = new weapon(WeaponType.FIREARMS, "AK-47");
        Boss boss = new Boss("boss", 100, bossWeapon);
        weapon skeletonWeapon = new weapon(WeaponType.FIREARMS, "Лук");

        Skeleton skeleton = new Skeleton(" 1 ", 20, skeletonWeapon, 10);
        Skeleton skeleton2 = new Skeleton(" 2 ", 20, skeletonWeapon, 15);

        System.out.println(boss.info() + bossWeapon.info());
        System.out.println(skeleton2.info() + skeletonWeapon.info());
        System.out.println(skeleton.info() + skeletonWeapon.info());


    }
}
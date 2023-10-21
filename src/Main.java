import model.User;
import model.Weapon;
import model.Agent;
import model.Map;
public class Main {
    public static void main(String[] args) {
        Weapon Bulldog = Weapon.BULLDOG;
        Weapon Melee = Weapon.MELEE;

        System.out.println(Bulldog.getType());
        System.out.println(Melee.getDamage());
        Bulldog.hitEnemy();

        Agent Fade = Agent.FADE;

        System.out.println(Fade.getCountry());

        User user1 = new User("loftykonuk","123456abc");

        System.out.println(user1.getUsername());
    }
}
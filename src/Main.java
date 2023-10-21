import model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Weapon bulldog = Weapon.BULLDOG;
        Weapon melee = Weapon.MELEE;

        System.out.println(bulldog.getType());
        System.out.println(melee.getDamage());
        bulldog.hitEnemy();

        Agent fade = Agent.FADE;

        System.out.println(fade.getCountry());

        User user1 = new User("lofty","123456abc", "TR");

        System.out.println(user1.getUsername());

        Map haven = Map.HAVEN;

        System.out.println(haven.getName());

        Rank playerRank = Rank.DIAMOND;

        playerRank.setRankPoint(59);

        System.out.println(playerRank.getFullRank());

        Market market = new Market(new String[]{"skin1", "skin2", "skin3", "skin4"}, new int[]{1000,2000,3000,2500});

        System.out.println(market.getSkins());
        System.out.println(market.getPriceOfSkin());
    }
}
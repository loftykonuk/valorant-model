import model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Weapon bulldog = Weapon.BULLDOG;
        Weapon melee = Weapon.MELEE;

        System.out.println(bulldog.getType());
        System.out.println(melee.getDamage());



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
        System.out.println(market.getProductNames());
        System.out.println(market.getProductPrices());



        Player player1 = new Player();
        player1.kill();player1.kill();player1.died();player1.assist();
        player1.buyAmor();
        player1.hit(69);
        System.out.println("Player health: " + player1.getHealth());
        System.out.println("Player KDA: " + player1.getKDA());



        Match match1 = new Match();
        match1.secondTeamRoundWin();match1.secondTeamRoundWin();match1.firstTeamRoundWin();
        System.out.println("Match score is " + match1.getMatchScore());
    }
}
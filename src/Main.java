import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import sports.Roster;
import sports.basketball.BasketballPlayer;
import sports.basketball.BasketballStats;
import sports.IPlayer;

/**
 * Class for testing the player classes.
 */
public class Main {

  /**
   * Class for testing the player classes.
   * @param args the arguments
   */
  public static void main(String[] args) {

    IPlayer kobe;
    IPlayer shaq;
    IPlayer larry;

    // create a series of new basketball players for the dream team
    kobe = new BasketballPlayer("Kobe Bryant", 34, 6.6,
            new BasketballStats(35.4, 9, 10));

    shaq =  new BasketballPlayer("Shaquille O'Neal", 47,7.4,
            new BasketballStats(29.5, 18, 8));

    larry = new BasketballPlayer("Larry Bird", 62, 6.9,
            new BasketballStats(36, 10, 12));

    IPlayer julius;
    IPlayer mike;

    julius = new BasketballPlayer("Julius Erving",69, 6.7,
            new BasketballStats(33, 12, 12));

    mike = new BasketballPlayer("Michael Jordan", 61, 6.8,
            new BasketballStats(38, 11, 13));

    // now we can test individuals by variable name, plus let's add them all to our team
    List<IPlayer> dreamTeam = new ArrayList<>();
    dreamTeam.add(kobe);
    dreamTeam.add(shaq);
    dreamTeam.add(larry);
    dreamTeam.add(julius);
    dreamTeam.add(mike);

    List<IPlayer> otherTeam = new ArrayList<>();
    otherTeam.add(kobe);
    otherTeam.add(shaq);
    otherTeam.add(larry);
    otherTeam.add(julius);
    otherTeam.add(mike);

    // print out each player in the dream team
    for (IPlayer each : dreamTeam) {

      System.out.println(each);

    }

    // create a new basketball roster with all the dream team members
    Roster<BasketballPlayer, Double> roster = new Roster(dreamTeam);

    // sort the dream team roster by total points
    roster.sortByStats();

    // print out all the players on the roster
    System.out.println("Roster: " + roster.getPlayers());

    System.out.println(roster.getPlayers().equals(otherTeam));

    // add a new player to the dream team roster
    roster.addPlayer(new BasketballPlayer("Keith", 59, 5.6,
            new BasketballStats(1,2,3)));

    // print the new roster
    System.out.println("New Roster: " + roster.getPlayers());

    BiFunction<BasketballPlayer, Double, Double > assists =
            (player, total) -> player.getStats().getAssistsPerGame() + total;

    BiFunction<BasketballPlayer, Double, Double > points =
            (player, total) -> player.getStats().getPointsPerGame() + total;

    System.out.println("Total Team Assists for the season: " + roster.fold(assists, 0.0));
    System.out.println("Total Team Points for the season: " + roster.fold(points, 0.0));

  }
}
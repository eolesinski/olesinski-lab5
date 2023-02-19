package sports.basketball;

import java.util.Comparator;

/**
 * Comparator class for comparing a basketball player's points per game.
 */
public class BasketballPlayerComparator implements Comparator<BasketballPlayer> {

  /**
   * The comparator for basketball player's points per game.
   * @param player1 the first object to be compared.
   * @param player2 the second object to be compared.
   * @return the comparison
   */
  public int compare(BasketballPlayer player1, BasketballPlayer player2) {

    // compare the points per game stats between two players
    return Double.compare(player1.getStats().getPointsPerGame(),
            player2.getStats().getPointsPerGame());

  }

}

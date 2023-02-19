package sports.basketball;

import java.util.Objects;

/**
 * Clas for a basketball stat.
 */
public class BasketballStats {
  private double pointsPerGame;
  private double reboundsPerGame;
  private double assistsPerGame;

  /**
   * Constructor for basketball stats.
   * @param pointsPerGame the points per game
   * @param reboundsPerGame the rebounds per game
   * @param assistsPerGame the assists per game
   */
  public BasketballStats(double pointsPerGame, double reboundsPerGame,
                         double assistsPerGame) {

    // the instance variables for a basketball stats object
    this.pointsPerGame = pointsPerGame;
    this.reboundsPerGame = reboundsPerGame;
    this.assistsPerGame = assistsPerGame;

  }

  /**
   * Getter method for getting the total points per game
   * @return the total points per game
   */
  public double getPointsPerGame() {

    return this.pointsPerGame;

  }

  /**
   * Getter method for getting the rebounds per game
   * @return the rebounds per game
   */
  public double getReboundsPerGame() {
    return this.reboundsPerGame;
  }

  public double getAssistsPerGame() {
    return this.assistsPerGame;
  }

  public boolean equals(Object other) {
    if(this == other) return true;
    if(this.getClass() != other.getClass()) return false;
    BasketballStats o = (BasketballStats) other;
    if(this.assistsPerGame == o.assistsPerGame
            && this.reboundsPerGame == o.reboundsPerGame
            && this.pointsPerGame == o.pointsPerGame) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return Objects.hash(this.assistsPerGame, this.reboundsPerGame, this.pointsPerGame);
  }

}
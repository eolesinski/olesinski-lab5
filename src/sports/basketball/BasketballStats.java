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

  /**
   * Getter method for returning the total assists per game.
   * @return the assists per game
   */
  public double getAssistsPerGame() {

    // return the assists instance variable
    return this.assistsPerGame;

  }

  /**
   * Equals method.
   * @param other the other object
   * @return true or false depending on whether the two objects are equal or not
   */
  public boolean equals(Object other) {

    // check to see if the two objects are equal
    if (this == other) {

      // if they are equal return true
      return true;

    }

    // check to see if the two objects are not equal
    if (this.getClass() != other.getClass()) {

      // if they are not equal return false
      return false;

    }

    // create a new basketball stats object
    BasketballStats o = (BasketballStats) other;


    if (this.assistsPerGame == o.assistsPerGame
            && this.reboundsPerGame == o.reboundsPerGame
            && this.pointsPerGame == o.pointsPerGame) {

      return true;

    }

    return false;

  }

  /**
   * Hashcode method.
   * @return the hashcode
   */
  public int hashCode() {

    return Objects.hash(this.assistsPerGame, this.reboundsPerGame, this.pointsPerGame);

  }

}
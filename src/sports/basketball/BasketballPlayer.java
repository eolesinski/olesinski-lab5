package sports.basketball;

import java.util.Objects;

import sports.IPlayer;

/**
 * Class for creating a new instance of a basketball player.
 */
public class BasketballPlayer implements IPlayer<BasketballStats> {

  // create teh instance variables
  private final String name;

  private final int age;

  private final double height;

  // use a has-a relationship to own one basketball stats object
  private BasketballStats stats;

  /**
   * The constructor for a basketball player.
   * @param name the name of the player
   * @param age the age of the player
   * @param height the height of the player
   * @param stats the stat of a player
   */
  public BasketballPlayer(String name, int age, double height, BasketballStats stats) {

    // assign the instance variables in the constructor
    this.name =  name;
    this.age  = age;
    this.height = height;
    this.stats = stats;

  }

  /**
   * A copy constructor for a basketball player.
   * @param otherPlayer the other player
   */
  public BasketballPlayer(BasketballPlayer otherPlayer) {

    // create another player
    this(otherPlayer.name, otherPlayer.age, otherPlayer.height, otherPlayer.stats);

  }

  /**
   * Method for getting the name of a basketball player.
   * @return the name of a basketball player
   */
  @Override
  public String getName() {

    // return the name instance variable
    return this.name;

  }

  /**
   * Method for getting the age of a basketball player.
   * @return the age of a basketball player
   */
  @Override
  public int getAge() {

    // return the age instance variable
    return this.age;

  }

  /**
   * Method for getting the height of a basketball player.
   * @return the height of a basketball player
   */
  @Override
  public double getHeight() {

    // return the height instance variable
    return this.height;

  }

  /**
   * Method for getting the stats of a basketball player.
   * @return the stats of a basketball player
   */
  @Override
  public BasketballStats getStats() {

    // return the stats instance variable
    return this.stats;

  }

  /**
   * Method for getting the string representation of a basketball player.
   * @return the string representation of a basketball player
   */
  @Override
  public String toString() {

    // return a string representation of a basketball player
    return this.name + " (Age:" + this.age + ", Height:" + this.height + ")" + this.stats.getPointsPerGame();

  }

  /**
   * Equals method for comparing two basketball players.
   * @param other the other basketball player
   * @return true or false depending on whether they are the same or not
   */
  @Override
  public boolean equals(Object other) {

    // identity check (if it is the same object then they are equal)
    if (this == other) {

      return true;
    }

    // see if the classes are the same
    if (this.getClass() != other.getClass()) {

      // if they are not the same class return false
      return false;
    }

    // we need to do an explicit downcast for attribute check
    BasketballPlayer b = (BasketballPlayer) other;

    // check each of the attribute values to see if they are equal to each other or not
    if (this.age == b.age) {

      return true;
    }

    // if each of these fail then it is false
    return false;

  }

}

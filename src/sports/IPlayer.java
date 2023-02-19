package sports;

/**
 * Interface for a player.
 * @param <T> generic
 */
public interface IPlayer<T> {

  /**
   * Method for getting the name of a player.
   * @return the name of a player
   */
  String getName();

  /**
   * Method for getting the age of a player.
   * @return the age of a player
   */
  int getAge();

  /**
   * Method for getting the height of a player.
   * @return the height of a player.
   */
  double getHeight();

  /**
   * Generic method for getting the stats of a player.
   * @return the stats of a player
   * @param <T> the generic type
   */
  <T> T getStats(); // generic method returns status type T

}
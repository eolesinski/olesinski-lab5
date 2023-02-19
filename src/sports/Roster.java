package sports;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

import sports.basketball.BasketballPlayer;
import sports.basketball.BasketballPlayerComparator;

/**
 * Class for a roster object.
 * @param <T> generic type
 * @param <R> generic type
 */
public class Roster<T, R> {

  // the instance variables for the roster class
  private List<T> players;

  /**
   * Constructor for a roster object.
   */
  public Roster() {

    // create a new java array list
    this.players = new ArrayList<>();

  }

  /**
   * Second constructor for creating a roster object.
   * @param players a list of players
   */
  public Roster(List<T> players) {

    this.players = players;

  }

  /**
   * Method for getting a list of players from a roster.
   * @return the list of players from a roster
   */
  public List<T> getPlayers() {

    // return the collection of players
    return new ArrayList<>(players);

  }

  /**
   * Method for adding a player to the roster.
   * @param player the player to add to the roster
   */
  public void addPlayer(T player) {

    // add the new player to our list of players
    this.players.add(player);

  }

  /**
   * Method for sorting the players on a roster by their stats.
   */
  public void sortByStats() {

    this.players.sort((Comparator<? super T>) new BasketballPlayerComparator());

    // use our comparator to sort
    // the previous generic is using a wildcard ? basically stating the type can be any T
    // or a super type of T this is Turkish Delights from Java "deep magic" - don't worry
    // if you don't understand it - you can use this method safely without editing it or
    // knowing how it works under the hood. Asland.

  }

  /**
   * Bi-function for combining individual stats a team has into one value.
   * @param combiner the combining function
   * @param seedValue the seed value
   * @param <R> the parameter
   * @return the team stats
   */
  // Bi-Function to combine individual stats the dream team has, into one value

  // first parameter denotes the type of the first argument, the second parameter
  // represents the type of the second argument, and the third represents the return type
  public <R> R fold(BiFunction<T, R, R> combiner, R seedValue) {

    //  here we fold/reduce in order to combine an initial value to get a combined form
    // Note: this is of the form List => value


    R result = combiner.apply(this.players.get(0), seedValue);
    combiner.apply(this.players.get(1), seedValue);

    return result;


    // given a bi-function and a seed-value (initial value), combine all the values from
    // each player into a single value. The value we're combining will be dependent on the
    // bi-function passed in as a parameter T and R are "formal" parameters that may be bound
    // to 2 different concrete types

    /*

    BiFunction<BasketballPlayer, Double, Double> assists =
            (player, total) -> player.getStats().getAssistsPerGame() + total;

    System.out.println("Total Team Assists for the season: " + roster.fold(assists, 0.0));

     */

  }

}
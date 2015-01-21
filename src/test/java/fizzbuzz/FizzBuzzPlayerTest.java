package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'twer' at '1/21/15 7:19 AM' with Gradle 2.2.1
 *
 * @author twer, @date 1/21/15 7:19 AM
 */
public class FizzBuzzPlayerTest {

    private FizzBuzzPlayer fizzBuzzPlayer;

    @Before
    public void initialize() {
        fizzBuzzPlayer = new FizzBuzzPlayer();
    }

    // TODO: the player should say the number if the number is normal (1, 2, 4, ..., 98)
    @Test
    public void the_player_should_say_the_number_if_the_number_is_normal() {
        assertEquals("1", fizzBuzzPlayer.say(1));
        assertEquals("98", fizzBuzzPlayer.say(98));
    }

    // TODO: the player should say fizz if the number is a multiple of 3 but not a multiple of 15 (3, 6, 9, 12, 18, ..., 99)
    @Test
    public void the_player_should_say_fizz_if_the_number_is_a_multiple_of_3_but_not_a_multiple_of_15() {
        assertEquals("fizz", fizzBuzzPlayer.say(3));
        assertEquals("fizz", fizzBuzzPlayer.say(99));
    }

    // TODO: the player should say buzz if the number is a multiple of 5 but not a multiple of 15 (5, 10, 20, ..., 100)
    @Test
    public void the_player_should_say_buzz_if_the_number_is_a_multiple_of_5_but_not_a_multiple_of_15() {
        assertEquals("buzz", fizzBuzzPlayer.say(5));
        assertEquals("buzz", fizzBuzzPlayer.say(100));
    }

    // TODO: the player should say fizzbuzz if the number is both a multiple of 3 and a multiple of 5 (15, 30, 45, 60, 75, 90)
    @Test
    public void the_player_should_say_fizzbuzz_if_the_number_is_both_a_multiple_of_3_and_a_multiple_of_5() {
        assertEquals("fizzbuzz", fizzBuzzPlayer.say(15));
        assertEquals("fizzbuzz", fizzBuzzPlayer.say(90));
    }
}

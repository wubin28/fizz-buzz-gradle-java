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

    @Test
    public void the_player_should_say_the_number_if_the_number_is_normal() {
        assertEquals("1", fizzBuzzPlayer.say(1));
        assertEquals("98", fizzBuzzPlayer.say(98));
    }

    @Test
    public void the_player_should_say_fizz_if_the_number_is_a_multiple_of_3_but_not_a_multiple_of_15() {
        assertEquals("fizz", fizzBuzzPlayer.say(3));
        assertEquals("fizz", fizzBuzzPlayer.say(99));
    }

    @Test
    public void the_player_should_say_buzz_if_the_number_is_a_multiple_of_5_but_not_a_multiple_of_15() {
        assertEquals("buzz", fizzBuzzPlayer.say(5));
        assertEquals("buzz", fizzBuzzPlayer.say(100));
    }

    @Test
    public void the_player_should_say_fizzbuzz_if_the_number_is_both_a_multiple_of_3_and_a_multiple_of_5() {
        assertEquals("fizzbuzz", fizzBuzzPlayer.say(15));
        assertEquals("fizzbuzz", fizzBuzzPlayer.say(90));
    }
}

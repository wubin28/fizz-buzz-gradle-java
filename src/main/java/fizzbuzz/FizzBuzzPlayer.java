package fizzbuzz;

/**
 * Created by twer on 1/21/15.
 */
public class FizzBuzzPlayer {
    public String say(int i) {
        if (i % 3 == 0) return "fizz";
        return String.valueOf(i);
    }
}

package fizzbuzz;

/**
 * Created by twer on 1/21/15.
 */
public class FizzBuzzPlayer {
    public String say(int i) {
        if (i % 15 == 0) return "fizzbuzz";
        if (i % 3 == 0) return "fizz";
        if (i % 5 == 0) return "buzz";
        return String.valueOf(i);
    }
}

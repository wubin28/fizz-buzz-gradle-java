package fizzbuzz;

/**
 * Created by twer on 1/26/15.
 */
public class NormalNumberStrategy implements FizzBuzzStrategy {
    @Override
    public String say(int number) {
        return String.valueOf(number);
    }
}

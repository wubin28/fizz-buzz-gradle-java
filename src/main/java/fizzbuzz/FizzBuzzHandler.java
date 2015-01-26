package fizzbuzz;

/**
 * Created by twer on 1/26/15.
 */
public abstract class FizzBuzzHandler {
    FizzBuzzHandler successor;
    public abstract String handle(int number);
}

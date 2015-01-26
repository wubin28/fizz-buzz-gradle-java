package fizzbuzz;

/**
 * Created by twer on 1/26/15.
 */
public class Buzz extends FizzBuzzHandler {
    @Override
    public String handle(int number) {
        if (number % 5 == 0) return "buzz";
        successor = new NormalNumber();
        return successor.handle(number);
    }
}

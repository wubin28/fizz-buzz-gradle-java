package fizzbuzz;

/**
 * Created by twer on 1/26/15.
 */
public class Fizz extends FizzBuzzHandler {
    @Override
    public String handle(int number) {
        if (number % 3 == 0) return "fizz";
        successor = new Buzz();
        return successor.handle(number);
    }
}

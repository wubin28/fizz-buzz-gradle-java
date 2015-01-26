package fizzbuzz;

/**
 * Created by twer on 1/26/15.
 */
public class FizzBuzz extends FizzBuzzHandler {
    @Override
    public String handle(int number) {
        if (number % 15 == 0) return "fizzbuzz";
        successor = new Fizz();
        return successor.handle(number);
    }

}

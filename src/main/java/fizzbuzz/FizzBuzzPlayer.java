package fizzbuzz;

/**
 * Created by twer on 1/21/15.
 */
public class FizzBuzzPlayer {
    public String say(int number) {
        FizzBuzzHandler fizzBuzz = new FizzBuzz();
        return fizzBuzz.handle(number);
//        if (number % 15 == 0) return "fizzbuzz";
//        if (number % 3 == 0) return "fizz";
//        if (number % 5 == 0) return "buzz";
//        return String.valueOf(number);
    }
}

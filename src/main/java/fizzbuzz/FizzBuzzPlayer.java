package fizzbuzz;

/**
 * Created by twer on 1/21/15.
 */
public class FizzBuzzPlayer {
    private FizzBuzzStrategy strategy;

    public String say(int i) {
        return strategy.say(i);
    }

    public void setStrategy(FizzBuzzStrategy strategy) {
        this.strategy = strategy;
    }
}

package pl.sternik.as.strategy.quacking;

public class Squeaking implements Quack {

    @Override
    public void quack() {
        System.out.println("Pi - Pi - Pi");
    }
}

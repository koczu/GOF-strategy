package pl.sternik.as.strategy.quacking;

public class Quacking implements Quack {

    @Override
    public void quack() {
        System.out.println("Kwak Kwak Kwak");
    }
}

package pl.sternik.as.strategy.quacking;

public class Silent implements Quack {

    @Override
    public void quack() {
        System.out.println("I can't quack");
    }
}

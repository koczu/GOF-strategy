package pl.sternik.as.strategy.swimming;

public class Noswimming implements Swim {
    @Override
    public void swim() {
        System.out.println("I can't swim");
    }
}

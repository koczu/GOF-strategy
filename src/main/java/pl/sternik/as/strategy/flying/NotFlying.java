package pl.sternik.as.strategy.flying;

public class NotFlying implements Fly {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

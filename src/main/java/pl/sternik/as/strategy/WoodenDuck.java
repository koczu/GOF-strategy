package pl.sternik.as.strategy;


import pl.sternik.as.strategy.quacking.Silent;
import pl.sternik.as.strategy.flying.NotFlying;
import pl.sternik.as.strategy.swimming.Noswimming;

public class WoodenDuck extends Duck {
    public WoodenDuck(String name) {
        super("Wooden:"+ name, new NotFlying(),new Silent(), new Noswimming());
    }
}

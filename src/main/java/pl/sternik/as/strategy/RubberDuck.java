package pl.sternik.as.strategy;


import pl.sternik.as.strategy.quacking.Squeaking;
import pl.sternik.as.strategy.flying.NotFlying;
import pl.sternik.as.strategy.swimming.Noswimming;

public class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super("Rubber:"+ name, new NotFlying(),new Squeaking(), new Noswimming());
    }
}

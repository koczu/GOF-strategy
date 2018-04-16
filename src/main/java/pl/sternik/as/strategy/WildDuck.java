package pl.sternik.as.strategy;

import pl.sternik.as.strategy.quacking.Quacking;
import pl.sternik.as.strategy.flying.Flying;
import pl.sternik.as.strategy.swimming.Swimming;

public class WildDuck extends Duck {
    public WildDuck(String nazwa) {
        super("Wild:"+ nazwa, new Flying(),new Quacking(),new Swimming());
    }
}

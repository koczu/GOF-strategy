package pl.sternik.as.strategy;


import pl.sternik.as.strategy.quacking.Quacking;
import pl.sternik.as.strategy.flying.Flying;
import pl.sternik.as.strategy.swimming.Swimming;

public class MandarinDuck extends Duck {
    public MandarinDuck(String name) {
        super("Mandarin:"+ name, new Flying(),new Quacking(), new Swimming());
    }
}

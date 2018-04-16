package pl.sternik.as.strategy.goose;

import pl.sternik.as.strategy.Duck;
import pl.sternik.as.strategy.quacking.Silent;
import pl.sternik.as.strategy.flying.NotFlying;
import pl.sternik.as.strategy.swimming.Noswimming;

public class GooseDuckAdapter extends Duck {
    private Goose goose;
    public GooseDuckAdapter(Goose goose)
    {
        super("", new NotFlying(), new Silent(), new Noswimming());
        this.goose=goose;
    }

    @Override
    public void quack() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        goose.swimInGoose();
    }

    public Goose getGoose() {
        return goose;
    }

    public void setGoose(Goose goose) {
        this.goose = goose;
    }
}

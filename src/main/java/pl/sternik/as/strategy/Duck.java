package pl.sternik.as.strategy;

import pl.sternik.as.strategy.flying.NotFlying;
import pl.sternik.as.strategy.goose.Goose;
import pl.sternik.as.strategy.goose.GooseDuckAdapter;
import pl.sternik.as.strategy.quacking.Quack;
import pl.sternik.as.strategy.quacking.Silent;
import pl.sternik.as.strategy.flying.Fly;
import pl.sternik.as.strategy.swimming.Noswimming;
import pl.sternik.as.strategy.swimming.Swim;

public abstract class Duck implements Fly, Quack, Swim {
    private final String name;
    private Fly fly;
    private Quack quack;
    private Swim swim;


    public Duck(String name, Fly fly, Quack quack, Swim swim) {
        super();
        this.name = name;
        this.fly = fly;
        this.quack = quack;
        this.swim = swim;
    }

    public void quack() {
        quack.quack();
    }

    public void fly() {
    	fly.fly();
    }

    public void print() {
        System.out.println("I am" + name);
    }

    public void swim() {
        swim.swim();
    }


//    public void nauczLatac() {
//        System.out.println("Nauka latania w toku...");
//        setLatanie(new Latajaca());
//        lataj();
//    }

    public Quack getQuack() {
        return quack;
    }

    public void setQuack(Quack quack) {
        this.quack = quack;
    }
    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public Swim getSwim() {
        return swim;
    }

    public void setSwim(Swim swim) {
        this.swim = swim;
    }

    public static Duck getDuck(DuckTypes type, String name) {
        switch (type) {
            case Wild:
                return new WildDuck(name);

            case Mandarin:
                return new MandarinDuck(name);

            case Wooden:
                return new WoodenDuck(name);

            case Rubber:
                return new RubberDuck(name);

            case BrokenRubber:
                RubberDuck rubberDuck = new RubberDuck(name);
                rubberDuck.setQuack(new Silent());
                return rubberDuck;

            case Goose:
                return new GooseDuckAdapter(new Goose(name));

            case DeadDuck:
                WildDuck wildDuck = new WildDuck(name);
                wildDuck.setFly(new NotFlying());
                wildDuck.setSwim(new Noswimming());
                wildDuck.setQuack(new Silent());
                return wildDuck;

            default:
                return new WildDuck("Wild default");
        }
    }
}

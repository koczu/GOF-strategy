package pl.sternik.as.strategy;


import pl.sternik.as.strategy.quacking.Silent;
import java.util.ArrayList;
import java.util.List;

public class Simulation{

	public static void main(String[] args) {

		Duck wild = new WildDuck("Wild");
		
		wild.quack();
		wild.fly();
		wild.fly();
		
		Duck rubber = new RubberDuck("Yellow");
		Duck wooden = new WoodenDuck("Oak");
		Duck mandarin = new MandarinDuck("Male");

		List<Duck> ducks = new ArrayList<Duck>();
		ducks.add(wild);
		ducks.add(rubber);
		ducks.add(wooden);
		ducks.add(mandarin);
		
		for (Duck duck : ducks) {
			duck.print();
			duck.fly();
			duck.swim();
			duck.quack();
		}
		System.out.println("-------------------------------");
		rubber.quack();
		
		rubber.setQuack(new Silent());
		
		rubber.quack();
	}
}

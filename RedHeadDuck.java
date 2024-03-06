package strategy_pattern;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		// Set behaviors for a RedHeadDuck object
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
		swimBehaviour = new SwimWater();
	}
	@Override
	void display() {
		System.out.println("*****This is a RedHead Duck*****");
	}
}

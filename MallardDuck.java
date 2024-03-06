package strategy_pattern;

public class MallardDuck extends Duck{
	public MallardDuck() {
		// Set behaviors for a Mallard Duck object
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
		swimBehaviour = new SwimWater();
	}
	@Override
	void display() {
		System.out.println("*****This is a Mallard Duck*****");
	}
}

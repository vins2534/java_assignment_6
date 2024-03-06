package strategy_pattern;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		// Set behaviors for a Decoy Duck object
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Mute();
		swimBehaviour = new Floats();
	}
	@Override
	void display() {
		System.out.println("*****This is a Decoy Duck*****");
	}
}

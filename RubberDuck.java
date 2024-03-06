package strategy_pattern;

public class RubberDuck extends Duck {

    public RubberDuck() {
    	// Set behaviors for a Rubber Duck object
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
        swimBehaviour = new Floats();
    }

    @Override
	void display() {
		System.out.println("*****This is a Rubber Duck*****");
	}

}
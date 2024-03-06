package strategy_pattern;

public class DeadDuck extends Duck{

    public DeadDuck() {
    	// Set behaviors for a DeadDuck object
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Mute();
        swimBehaviour = new DrownWater();
        
    }

    @Override
	void display() {
		System.out.println("This is Dead Duck");
	}
}

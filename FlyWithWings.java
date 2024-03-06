package strategy_pattern;

public class FlyWithWings implements FlyBehvaiour{
	@Override
	public void fly() {
		System.out.println("This duck can fly with Wings.");
	}
}

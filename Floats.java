package strategy_pattern;

public class Floats implements SwimBehaviour{
	@Override
	public void swim() {
		System.out.println("This duck can float in water.");
	}
}

package strategy_pattern;

public class SwimWater implements SwimBehaviour{
	@Override
	public void swim() {
		System.out.println("This duck can swim in water.");
	}
}

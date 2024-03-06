package strategy_pattern;

public class FlyNoWay implements FlyBehvaiour{
	@Override
	public void fly() {
		System.out.println("This duck cannot fly.");
	}
}

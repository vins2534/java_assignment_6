package strategy_pattern;

public class Quack implements QuackBehaviour{
	@Override
	public void quack() {
		System.out.println("This duck can quack.");
	}
}

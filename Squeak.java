package strategy_pattern;

public class Squeak implements QuackBehaviour{
	@Override
	public void quack() {
		System.out.println("This duck only squeaks.");
	}
}

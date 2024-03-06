package strategy_pattern;

public class Mute implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("This duck can't quack.");

	}

}


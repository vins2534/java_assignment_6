package strategy_pattern;

public class DrownWater implements SwimBehaviour{
    @Override
    public void swim(){
        System.out.println("This duck drowns in water.");
    }
}

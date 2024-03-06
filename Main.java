package strategy_pattern;

public class Main {
    public static void main(String[] args) {
        // Creating a RedHeadDuck object and demonstrating its behavior
        RedHeadDuck rhd = new RedHeadDuck();
        rhd.display();
        rhd.performFly();
        rhd.performQuack();
        rhd.performSwim();
        
        // Creating a RubberDuck object and demonstrating its behavior
        RubberDuck rd = new RubberDuck();
        rd.display();
        rd.performFly();
        rd.performQuack();
        rd.performSwim();
        
        // Creating a DecoyDuck object and demonstrating its behavior
        DecoyDuck dd = new DecoyDuck();
        dd.display();
        dd.performFly();
        dd.performQuack();
        dd.performSwim();
        
        // Creating a MallardDuck object and demonstrating its behavior
        MallardDuck md = new MallardDuck();
        md.display();
        md.performFly();
        md.performQuack();
        md.performSwim();
    }
}

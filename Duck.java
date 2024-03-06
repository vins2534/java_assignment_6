package strategy_pattern;
public abstract class Duck {
    
    FlyBehvaiour flyBehaviour;

    QuackBehaviour quackBehaviour;

    SwimBehaviour swimBehaviour;

    public void setFlyBehaviour(FlyBehvaiour fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }

    public void setSwimBehaviour(SwimBehaviour sb){
        swimBehaviour = sb;
    }

    abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performSwim(){
        swimBehaviour.swim();
    }

}
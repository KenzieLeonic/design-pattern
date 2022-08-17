package compositePattern;


public class CountingDuckFactory extends AbstractFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }
    @Override
    public Quackable createRedheadDuck(){
        return new QuackCounter(new RedheadDuck());
    }
    @Override
    public Quackable createRubberDuck(){
        return new QuackCounter(new RubberDuck());
    }
    
}

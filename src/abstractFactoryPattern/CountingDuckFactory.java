package abstractFactoryPattern;


public class CountingDuckFactory extends AbstractFactory{
    @Override
    public Quackable createMallardQuack() {
        return new QuackCounter(new MallardDuck());
    }
    @Override
    public Quackable createRedheadQuack(){
        return new QuackCounter(new RedheadDuck());
    }
    @Override
    public Quackable createRubberDuck(){
        return new QuackCounter(new RubberDuck());
    }
    
}

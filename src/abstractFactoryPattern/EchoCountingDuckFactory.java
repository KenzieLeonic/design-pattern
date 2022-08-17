package abstractFactoryPattern;

public class EchoCountingDuckFactory extends AbstractFactory{
    @Override
    public Quackable createMallardQuack() {
        return new QuackEcho(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadQuack() {
        return new QuackEcho(new QuackCounter(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackEcho(new QuackCounter(new RubberDuck()));
    }
}

package abstractFactoryPattern;

public abstract class QuackFactory {
    abstract Quackable getQuack(String quackType);
}

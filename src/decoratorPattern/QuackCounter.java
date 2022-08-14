package decoratorPattern;

public class QuackCounter implements Quackable{
    Quackable duck;
    static int numberOfQuacks = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }
    public void Quack() {
        duck.Quack();
        numberOfQuacks++;
    }
    public static int getQuacks() { return numberOfQuacks; }
    
}

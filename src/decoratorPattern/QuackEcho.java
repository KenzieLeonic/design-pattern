package decoratorPattern;

public class QuackEcho implements Quackable {
    Quackable duck;

    static int numberOfQuacks = 0;
    public QuackEcho (Quackable duck) {
        this.duck = duck;
    }

    public void Quack() {
        duck.Quack();
        System.out.println("Echo: ");
        duck.Quack();
    }

}

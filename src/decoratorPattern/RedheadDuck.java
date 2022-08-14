package decoratorPattern;

public class RedheadDuck implements Quackable {
    @Override
    public void Quack() {
        System.out.println("Kwak");
    }
}

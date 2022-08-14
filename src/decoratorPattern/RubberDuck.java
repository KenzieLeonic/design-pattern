package decoratorPattern;

public class RubberDuck implements Quackable {
    @Override
    public void Quack() {
        System.out.println("Squeak");
    }
}

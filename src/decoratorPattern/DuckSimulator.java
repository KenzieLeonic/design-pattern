package decoratorPattern;

public class DuckSimulator {
public static void main(String[] args) {
    DuckSimulator simulator = new DuckSimulator();
    simulator.simulate();   
}
    void simulate() {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator With Decorator: ");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The duck quacked " + QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.Quack();
    }

}

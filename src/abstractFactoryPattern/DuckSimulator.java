package abstractFactoryPattern;


public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractFactory duckFactory = new CountingDuckFactory();
        //AbstractFactory echoCounterDuckFactory = new EchoCountingDuckFactory();

        simulator.simulate(duckFactory);
    }
     void simulate(AbstractFactory duckFactory){
         Quackable mallardDuck = duckFactory.createMallardQuack();
         Quackable redheadDuck = duckFactory.createRedheadQuack();
         Quackable rubberDuck = duckFactory.createRubberDuck();
         Quackable goose = new GooseAdapter(new Goose());

         System.out.println("\nDucks Simulator");

         simulate(mallardDuck);
         simulate(redheadDuck);
         simulate(rubberDuck);
         simulate(goose);
         System.out.println("\nThe Duck quacked " + QuackCounter.getQuacks()+ " times");

     }

//    void simulate(AbstractFactory echoCounterDuckFactory){
//        Quackable mallardDuck = echoCounterDuckFactory.createMallardQuack();
//        Quackable redheadDuck = echoCounterDuckFactory.createRedheadQuack();
//        Quackable rubberDuck = echoCounterDuckFactory.createRubberDuck();
//        Quackable goose = new GooseAdapter(new Goose());
//
//        System.out.println("\nDucks Simulator");
//
//
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(rubberDuck);
//        simulate(goose);
//        System.out.println("\nThe Duck quacked " + QuackCounter.getQuacks()+ " times");
//
//    }

    void simulate(Quackable duck){
        duck.Quack();
    }
}



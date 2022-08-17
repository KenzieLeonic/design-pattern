package compositePattern;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractFactory duckFactory = new CountingDuckFactory();
        //AbstractFactory echoCounterDuckFactory = new EchoCountingDuckFactory();

        simulator.simulate(duckFactory);
    }
     void simulate(AbstractFactory duckFactory){
        //สร้าง quackable ที่สามารถเรียก quack ได้
         Quackable mallardDuck = duckFactory.createMallardDuck();
         Quackable redheadDuck = duckFactory.createRedheadDuck();
         Quackable rubberDuck = duckFactory.createRubberDuck();
         Quackable goose = new GooseAdapter(new Goose());

         System.out.println("\nDucks Simulator");

         //สร้าง flonk ที่มีแต่ quackable.
        Flock flockOfDucks = new Flock();

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        //เรียกแค่ mallard duck
         Flock flockOfMallards = new Flock();


         Quackable mallard1 = duckFactory.createMallardDuck();
         Quackable mallard2 = duckFactory.createMallardDuck();
         Quackable mallard3 = duckFactory.createMallardDuck();
         Quackable mallard4 = duckFactory.createMallardDuck();

         flockOfMallards.add(mallard1);
         flockOfMallards.add(mallard2);
         flockOfMallards.add(mallard3);
         flockOfMallards.add(mallard4);

         // เพิ่ม Flock ที่มีแต่ MallardDuck
         // เข้าไปใน Flock ของ Quackable
         flockOfDucks.add(flockOfMallards);

         System.out.println("\nWhole Flock Simulation");
         simulate(flockOfDucks);

         // simulate flock ของ mallard
         System.out.println("\nMallard Flock Simulation");
         simulate(flockOfMallards);

         simulate(mallardDuck);
         simulate(redheadDuck);
         simulate(rubberDuck);
         simulate(goose);
         System.out.println("\nThe Duck quacked " + QuackCounter.getQuacks()+ " times");


         System.out.println("\nThe ducks quacked "
                 + QuackCounter.getQuacks()
                 + " times");

     }



    void simulate(Quackable duck){
        duck.Quack();
    }
}



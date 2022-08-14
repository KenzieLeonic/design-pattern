package decoratorPattern;

/**
 * GooseAdapter
 */
public class GooseAdapter implements Quackable{
    Goose goose;
    public GooseAdapter(Goose goose) { 
        this.goose = goose;
    }

    public void Quack(){
        goose.honk();
    }
}
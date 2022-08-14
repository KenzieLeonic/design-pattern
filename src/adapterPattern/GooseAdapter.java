package adapterPattern;

public class GooseAdapter implements Quackable{
    Goose goose;
    public GooseAdapter(Goose goose) { 
        this.goose = goose;
    }

    @Override
    public void Quack(){
        goose.honk();
    }
}

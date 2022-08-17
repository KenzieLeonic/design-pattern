package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable{
    List<Quackable> quackers;

    public Flock() {
        this.quackers = new ArrayList<>();
    }
    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void Quack() {
        for (Quackable quacker:quackers){
            //จ่าฝูง
            if(quackers.get(0) == quacker){
                quacker.Quack();
                quacker.Quack();
                quacker.Quack();
            }
            //ที่เหลือ ลูกน้อง
            else{
                quacker.Quack();
            }
        }
    }
}

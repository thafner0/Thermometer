package test;
import java.util.ArrayList;

public class Testfixtures {
    private ArrayList <Double> temperatures1 = new ArrayList <Double>();
    private ArrayList <Double> temperatures2 = new ArrayList <Double>();
    private ArrayList <Double> temperatures3 = new ArrayList <Double>();

    public void loadData(){
        temperatures1.add(97.4);
        temperatures1.add(97.5);
        temperatures1.add(97.4);
        temperatures1.add(97.3);
        temperatures1.add(97.2);
        temperatures1.add(97.3);

        temperatures2.add(20.1);
        temperatures2.add(20.3);
        temperatures2.add(20.4);
        temperatures2.add(20.3);
        temperatures2.add(20.2);
        temperatures2.add(20.2);

        temperatures3.add(18.9);
        temperatures3.add(78.1);
        temperatures3.add(47.91);
        temperatures3.add(86.56);
        temperatures3.add(18.9);
    }
}

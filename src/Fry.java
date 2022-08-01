import java.util.Scanner;

public class Fry {

    private String movieName;
    public Fry(String name) {
        movieName = name;
    }
    public String getName(){
        return movieName;
    }
    public void output(){
        System.out.printf("Любимый фильм - %s", getName());
    }
}

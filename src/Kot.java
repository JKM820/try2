import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util. *;
public class Kot {
    public String Say(){
        Scanner Cat = new Scanner(System.in);
        System.out.println("Ведите строку: ");
        String name = Cat.nextLine();
        return name;
    }
    public static void main(String[] args) {
        while (true) {
        Kot Go = new Kot();
        Kot Stop = new Kot();
        StringBuilder builder = new StringBuilder();
            builder.append(Go.Say());
            builder.append(" ");
            builder.append(Stop.Say());
            String completedString = builder.toString();
            System.out.printf("%s %s %10s \n","|",completedString, "|");
        }
    }
}

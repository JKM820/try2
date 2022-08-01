import java.util.Scanner;
import java.util.Random;
public class Happiness {
    public static void main(String[] args) {
      Scanner Cat = new Scanner(System.in);
      Scanner Dog = new Scanner(System.in);
      Random Pig = new Random();
      String go;
      int Happiness, Luck, Age, k;
      Happiness = 0;
      Luck = 0;
        System.out.println("Введите возраст: ");
        Age = Cat.nextInt();
          while(Age<=100) {
            System.out.print("Ваше имя: ");
            go = Dog.nextLine();
            if (go.equals("")){
              System.out.println("Введите имя!");
            }
            else {
              int n = go.length();
              System.out.println("Длина строки " +n);
              if ("Настя".equals(go)) {
                System.out.println("Привет");
              }
              String s = go.substring(0, 1);
              System.out.print(s + ", ");
              Happiness = Pig.nextInt(100);
              Luck = Pig.nextInt(100);
              k = Age % 10;
              if (Age < 15) {
                if (Age < 10) {
                  switch (k) {
                    case 1:
                      System.out.println("в ваш " + Age + " год, вы довольно продвинутый перец");
                      break;
                    case 2, 3, 4:
                      System.out.println("в ваши " + Age + " года, вы довольно продвинутый перец");
                      break;
                    default:
                      System.out.println("в ваши " + Age + " лет, вы довольно продвинутый перец");
                  }
                } else {
                  System.out.println("в ваши " + Age + " лет, вы довольно продвинутый перец");
                }
              } else {
                switch (k) {
                  case 1:
                    System.out.println("в ваш " + Age + " год, вы довольно продвинутый перец");
                    break;
                  case 2, 3, 4:
                    System.out.println("в ваши " + Age + " года, вы довольно продвинутый перец");
                    break;
                  default:
                    System.out.println("в ваши " + Age + " лет, вы довольно продвинутый перец");
                }
              }
              System.out.println("Уровень счастья " + Happiness);
              System.out.println("Уровень удачи " + Luck);
              Age++;
            }
            System.out.println("------------------------------");
      }
    }
}

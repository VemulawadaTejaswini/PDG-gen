import java.util.Objects;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pin = sc.nextInt();
    String[] pinstr = Integer.toString(pin).split("");
    if (Objects.equals(pinstr[0], pinstr[1])) {
      System.out.println("Bad");
      return;
    }
    if (Objects.equals(pinstr[1], pinstr[2])) {
      System.out.println("Bad");
      return;
    }
    if (Objects.equals(pinstr[2], pinstr[3])) {
      System.out.println("Bad");
      return;
    }
  System.out.println("Good");
  }
}
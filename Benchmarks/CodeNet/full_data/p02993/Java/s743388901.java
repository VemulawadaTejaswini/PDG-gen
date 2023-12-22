import java.util.Objects;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pin = sc.nextInt();
    String[] pinstr = null;
    try {
      pinstr = Integer.toString(pin).split("");
    } catch (Exception ignored) {}
    if (pinstr[0].equals(pinstr[1])) {
      System.out.println("Bad");
      return;
    }
    if (pinstr[1].equals(pinstr[2])) {
      System.out.println("Bad");
      return;
    }
    if (pinstr[2].equals(pinstr[3])) {
      System.out.println("Bad");
      return;
    }
    System.out.println("Good");
  }
}
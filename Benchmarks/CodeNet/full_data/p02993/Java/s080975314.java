import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] pin = sc.next().toCharArray();
    if (pin[0] == pin[1]) {
      System.out.println("Bad");
      return;
    }
    if (pin[1] == pin[2]) {
      System.out.println("Bad");
      return;
    }
    if (pin[2] == pin[3]) {
      System.out.println("Bad");
      return;
    }
    System.out.println("Good");
  }

}
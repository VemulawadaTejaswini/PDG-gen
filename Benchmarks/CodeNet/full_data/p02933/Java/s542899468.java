import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    Integer a = Integer.valueOf(s);
    if (a >=3200) {
      System.out.println(s);
    } else {
      System.out.println("red");
    }
  }
}
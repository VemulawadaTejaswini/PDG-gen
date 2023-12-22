import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    String T = "";
    if ("Sunny".equals(S)) {
      T = "Cloudy";
    } else if ("Cloudy".equals(S)) {
      T = "Rainy";
    } else if ("Rainy".equals(S)) {
      T = "Sunny";
    }
    System.out.println(T);
  }
}

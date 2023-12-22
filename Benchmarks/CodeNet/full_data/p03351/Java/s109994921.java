import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int c = Integer.parseInt(sc.next());
      int d = Integer.parseInt(sc.next());
      String result = (a - b + b - c) <= d ? "Yes" : "No";

      System.out.println(result);
    }
  }
}

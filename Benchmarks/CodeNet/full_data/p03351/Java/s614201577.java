import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int c = Integer.parseInt(sc.next());
      int d = Integer.parseInt(sc.next());
      String result = "No";
      if ((Math.abs(a - b) + Math.abs(b - c)) <= d * 2)
        result = "Yes";
      else if (Math.abs( a - c) <= d)
        result = "Yes";

      System.out.println(result);
    }
  }
}

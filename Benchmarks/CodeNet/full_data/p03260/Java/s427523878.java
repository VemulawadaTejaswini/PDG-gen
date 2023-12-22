import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(solve(a, b));
    }
  }

  public static String solve(int a, int b) {
    int c = a * b;  
    return c % 2 == 0 ? "No" : "Yes";
  }
}

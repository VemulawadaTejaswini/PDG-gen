import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int max = Math.max(Math.max(A, B), C);
    int sub = max * 3 - (A + B + C);
    if (sub % 2 == 0) {
      System.out.println(sub / 2);
    } else {
      System.out.println((sub + 3) / 2);
    }
  }
}
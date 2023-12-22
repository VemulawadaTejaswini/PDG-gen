import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    int prev = sc.nextInt();
    for (int i = 1; i < n; i++) {
      int num = sc.nextInt();
      if (prev - num >= 1) {
        System.out.println("No");
        return;
      }
      if (prev == num) prev = num;
      else prev = num - 1;
    }
    System.out.println("Yes");
  }
}

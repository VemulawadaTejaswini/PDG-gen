import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[4];
    boolean ans = true;
    for (int i = 0; i < 3; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      num[a-1]++;
      num[b-1]++;
      if (num[a-1] > 2 || num[b-1] > 2) {
        ans = false;
      }
    }
    System.out.println(ans ? "YES" : "NO");
  }
}
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 入力を受け取る
    int n = sc.nextInt();
    int[] monsters = new int[n];
    for (int i = 0; i < n; i++) {
      monsters[i] = sc.nextInt();
    }
    // gcd(a, a2, ..., an)
    int ans = monsters[0];
    for (int i = 1; i < n; i++) {
      ans = gcd(ans, monsters[i]);
    }
    System.out.println(ans);
  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a%b);
  }
}

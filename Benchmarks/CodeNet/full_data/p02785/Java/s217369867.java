import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] monsters = new int[n];
    for (int i = 0; i < n; i++) {
      monsters[i] = sc.nextInt();
    }
    Arrays.sort(monsters);
    long ans = 0;
    for (int i = 0; i < n - k; i++) {
      ans += monsters[i];
    }
    System.out.println(ans);
  }
}
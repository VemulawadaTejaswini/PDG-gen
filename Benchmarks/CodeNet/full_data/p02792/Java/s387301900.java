import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[][] c = new long[10][10];
    for(int i = 1; i <= n; i++) {
      String s = String.valueOf(i);
      int d1 = Integer.parseInt(String.valueOf(0));
      int d2 = Integer.parseInt(String.valueOf(s.length() - 1));
      c[d1][d2]++;
    }
    long ans = 0;
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        ans += (c[i][j] * c[j][i]);
      }
    }
    System.out.println(ans);
  }
}
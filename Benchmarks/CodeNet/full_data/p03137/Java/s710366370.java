import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] x = new int[m];
    for(int i = 0; i < m; i++) {
      x[i] = sc.nextInt();
    }
    Arrays.sort(x);
    int[] b = new int[m - 1];
    for(int i = 1; i < m; i++) {
      b[i] = x[i] - x[i - 1];
    }
    Arrays.sort(b);
    int ans = x[m - 1] - x[0];
    int sum = 0;
    for(int i = m - 2; i >= (m - n); i--) {
      sum += b[i];
    }
    ans -= sum;
    if(n >= m) ans = 0;
    System.out.println(ans);
  }
}
import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] d = new int[n];
    int ans = 1;
    for (int cnt = 0; cnt < n; cnt++) {
      d[cnt] = sc.nextInt();
    }

    Arrays.sort(d);
    for (int cnt = 1; cnt < n; cnt++) {
      if (d[cnt] != d[cnt - 1]) {
        ans++;
      }
    }
    System.out.println(ans);
    sc.close();
  }
}
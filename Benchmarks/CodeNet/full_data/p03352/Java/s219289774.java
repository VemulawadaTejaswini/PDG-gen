import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

  private static final Scanner in = new Scanner(System.in);
  private static final PrintWriter out = new PrintWriter(System.out);

  private static int[] nextArray(int n) {
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    return arr;
  }

  public static void main(String[] args) {
    int a = in.nextInt();
    solve(a);
    out.flush();
    out.close();
  }

  private static void solve(int a) {
    int res = 0;
    for (int i = 1; i <= a; i++) {
      for (int j = 2; j < 10; j++) {
        if (Math.pow(i, j) <= a) {
          res = (int) Math.max(res, Math.pow(i, j));
        }
      }
    }
    if (res == 0) {
      res = a;
    }
    out.println(res);

  }
  
}
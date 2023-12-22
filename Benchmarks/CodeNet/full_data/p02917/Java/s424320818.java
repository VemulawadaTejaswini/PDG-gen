import java.util.Scanner;

public class Main {
  private static void solve(int n, int[] b) {
    long sum = 0;
    for (int i = n - 2; i >= 0; i--) {
      sum += Math.min(b[i], b[i + 1]);
    }
    sum += b[0];
    System.out.println(sum);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] bs = sc.nextLine().split(" ");
    int[] b = new int[n];
    for (int i = 0; i < n - 1; i++) b[i] = Integer.parseInt(bs[i]);
    b[n - 1] = Integer.MAX_VALUE;
    sc.close();
    solve(n, b);
  }
}
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    int[] h = new int[n];
    double abs = 100000;
    int result = 1;
    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
      double temperature = t - h[i] * 0.006;
      if (Math.abs(a - temperature) < abs) {
        abs = Math.abs(a - temperature);
        result = i + 1;
      }
    }
    System.out.println(result);
  }
}
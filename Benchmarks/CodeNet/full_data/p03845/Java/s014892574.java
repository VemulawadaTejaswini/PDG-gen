import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ts = new int[n];
    for (int i = 0; i < n; ++i) {
      ts[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    int[] ps = new int[m];
    int[] xs = new int[m];
    for (int i = 0; i < m; ++i) {
      ps[i] = sc.nextInt();
      xs[i] = sc.nextInt();
    }
    int sumT = 0;
    for (int i = 0; i < n; ++i) {
      sumT += ts[i];
    }

    for (int i = 0; i < m; ++i) {
      System.out.println(sumT - (ts[ps[i] - 1] - xs[i]));
    }
  }
}

import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int N;

  public static void main(String[] args) {
    N = sc.nextInt();
    int[] hist = new int[100001];
    for (int i = 0; i < N; i++) {
      hist[sc.nextInt()]++;
    }
    int ans = 0;
    int two = 0;
    for (int i = 0; i < hist.length; i++) {
      if (hist[i] >= 3) {
        int count = (hist[i] - 1) / 2;
        ans += count;
        hist[i] -= count * 2;
      }
      if (hist[i] == 2) ++two;
    }
    ans += (two + 1) / 2;
    System.out.println(N - ans * 2);
  }

}

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int sum = 0;
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      sum += a[i];
    }
    int minDiff = 1000000000;
    int minDiffIdx = 0;
    for (int i = 0; i < N; i++) {
      int diff = Math.abs(a[i]*N-sum);
      if (minDiff > diff) {
        minDiff = diff;
        minDiffIdx = i;
      }
    }
    System.out.println(minDiffIdx);
  }
}
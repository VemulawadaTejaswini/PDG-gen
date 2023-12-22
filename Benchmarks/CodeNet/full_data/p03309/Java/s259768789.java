import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long sum = 0;
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt() - (i + 1);
      sum += a[i];
    }
    long avg = sum / N;
    long p1 = compute(a, avg);
    long p2 = compute(a, avg - 1);
    long p3 = compute(a, avg + 1);

    if (p1 < p2 && p1 < p3) {
      System.out.println(p1);
      return;
    }
    if (p2 < p3) {
      sum = p2;
      for (int i = -2; ; i--) {
        long p = compute(a, avg + i);
        if (p < sum) {
          sum = p;
          continue;
        }
        System.out.println(sum);
        return;
      }
    } else {
      sum = p3;
      for (int i = 2; ; i++) {
        long p = compute(a, avg + i);
        if (p < sum) {
          sum = p;
          continue;
        }
        System.out.println(sum);
        return;
      }
    }
  }

  public static long compute(int[] a, long b) {
    long r = 0;
    for (int i = 0; i < a.length; i++) {
      r += Math.abs(a[i] - b);
    }
    return r;
  }
}

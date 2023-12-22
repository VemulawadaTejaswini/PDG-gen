import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long sum = 0;
    long[] a = new long[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextLong() - (i + 1);
      sum += a[i];
    }

    long b = sum / N;

    long k1 = 0;
    long k2 = 0;
    long k3 = 0;
    for (int i = 0; i < N; i++) {
      k1 += Math.abs(a[i] - b);
      k2 += Math.abs(a[i] - (b - 1));
      k3 += Math.abs(a[i] - (b + 1));
    }

    if (k1 < k2 && k1 < k3) {
      System.out.println(k1);
    } else if (k2 < k1 && k2 < k3) {
      System.out.println(k2);
    } else {
      System.out.println(k3);
    }
  }
}

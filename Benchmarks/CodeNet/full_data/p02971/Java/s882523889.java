import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int max = 0;
    int nmax = 0;
    int maxi = -1;
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
      if (a[i] > max) {
        nmax = max;
        max = a[i];
        maxi = i;
      } else if (a[i] > nmax) {
        nmax = a[i];
      }
    }

    for (int i = 0; i < N; i++) {
      if (i == maxi)
        System.out.println(nmax);
      else
        System.out.println(max);
    }
  }
}

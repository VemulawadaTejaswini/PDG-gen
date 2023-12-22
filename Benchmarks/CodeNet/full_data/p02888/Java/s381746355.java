import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] L = new int[N];
    for (int i = 0; i < N; i++) {
      L[i] = sc.nextInt();
    }
    Arrays.sort(L);
    int ans = 0;
    for (int i = 0; i < N - 2; i++) {
      int a = L[i];
      for (int j = i + 1; j < N - 1; j++) {
        int b = L[j];
        int l = j + 1, r = N - 1;
        while (l + 1 < r) {
          int m = (l + r) / 2;
          if (L[m] < a + b) {
            l = m;
          } else {
            r = m;
          }
        }
        int c1 = L[l];
        int c2 = L[r];
        if (c2 < a + b) {
          ans += r - j;
        } else if (c1 < a + b){
          ans += l - j;
        }
      }
    }
    System.out.println(ans);
  }
}

// nC3 = n! / ((n-3)!3!) = n * (n-1) * (n-2) / 6

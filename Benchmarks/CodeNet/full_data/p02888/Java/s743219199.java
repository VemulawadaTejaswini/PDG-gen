import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] L = new int[N];
    for (int i = 0; i < N; i++) {
      L[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < N - 2; i++) {
      int a = L[i];
      for (int j = i + 1; j < N - 1; j++) {
        int b = L[j];
        for (int k = j + 1; k < N; k++) {
          int c = L[k];
          if (a < b + c && b < c + a && c < a + b) {
            ans++;
          }
        }
      }
    }
    System.out.println(ans);
  }
}

// nC3 = n! / ((n-3)!3!) = n * (n-1) * (n-2) / 6

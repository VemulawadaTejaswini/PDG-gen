import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] L = new int[n];
    for (int i = 0; i < n; i++) {
        L[i] = sc.nextInt();
    }

    Arrays.sort(L);

    int ans = 0;

    for (int i = 0; i < n; i++) {
      int a = L[i];
      for (int j = i+1; j < n; j++) {
        int b = L[j];
        for (int k = j+1; k < n; k++) {
          int c = L[k];
          if (a < b + c && b < c + a && c < a + b) {
            ans++;
          } else {
            break;
          }
        }
      }
    }

    System.out.println(ans);
  }
}
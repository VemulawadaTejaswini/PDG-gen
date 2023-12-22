import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int cnt = 0;

    for (int i = 0; i < n - 2; i++) {
        String char_i = s.substring(i, i + 1);

      for (int j = i + 1; j < n - 1; j++) {
        String char_j = s.substring(j, j + 1);
        if (!char_j.equals(char_i)) {

          for (int k = j + 1; k < n; k++) {
            if (j - i == k - j) {
              continue;
            }

            String char_k;
            if (k == n - 1) {
              char_k = s.substring(k);
            } else {
              char_k = s.substring(k, k + 1);
            }
            if (!char_k.equals(char_i) && !char_k.equals(char_j)) {
              cnt++;
            }
          }
        }
      }
    }

    System.out.println(cnt);

  }
}

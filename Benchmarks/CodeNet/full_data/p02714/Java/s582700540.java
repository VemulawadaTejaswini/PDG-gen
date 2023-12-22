import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = Integer.parseInt(sc.next());
      char[] S = sc.next().toCharArray();
      int result = 0;

      for (int i = 0; i < N - 2; i++) {
        for (int j = i; j < N - 1; j++) {
          if (S[i] == S[j])
            continue;
          for (int k = j; k < N; k++) {
            if (S[i] == S[k] || S[j] == S[k])
              continue;
            if (j - i == k - j)
              continue;
            result++;
          }

        }

      }

      System.out.println(result);
    }
  }
}

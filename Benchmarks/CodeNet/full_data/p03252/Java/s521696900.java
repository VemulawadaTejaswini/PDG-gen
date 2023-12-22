import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    char[] T = sc.next().toCharArray();
    for (int i = 0; i < S.length; i++) {
      if (S[i] == T[i]) {
        // skip
        continue;
      }
      char c1 = S[i];
      char c2 = T[i];
      // swap c1, c2
      for (int j = 0; j < S.length; j++) {
        if (S[j] == c1) {
          S[j] = c2;
        } else if (S[j] == c2) {
          S[j] = c1;
        }
      }
    }
    if (Arrays.equals(S, T)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
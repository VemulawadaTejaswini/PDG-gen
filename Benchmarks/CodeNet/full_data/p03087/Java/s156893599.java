import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int Q = in.nextInt();
      String S = in.next();
      int[] countAC = new int[N];

      for (int i  = 1; i < S.length(); ++i) {
        countAC[i] = countAC[i - 1];

        if (S.charAt(i - 1) == 'A' && S.charAt(i) == 'C') {
          ++countAC[i];
        }
      }

      while (Q-- > 0) {
        int l = in.nextInt() - 1;
        int r = in.nextInt() - 1;

        System.out.println(countAC[r] - countAC[l]);
      }
    }
  }
}
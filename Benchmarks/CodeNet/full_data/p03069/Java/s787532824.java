import java.util.Scanner;

public class Main {
  final static char WHITE = '.';
  final static char BLACK = '#';

  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      char[] S = in.next().toCharArray();
  
      int i = 0;
      while (i < S.length && S[i] == WHITE) {
        ++i;
      }

      int change = 0;
      while (i < S.length) {
        int countBlack = 0;
        while (i < S.length && S[i] == BLACK) {
          ++countBlack;
          ++i;
        }

        int countWhite = 0;
        while (i < S.length && S[i] == WHITE) {
          ++countWhite;
          ++i;
        }

        if (countWhite > 0) {
          change += Math.min(countBlack, countWhite);
        }
      }

      System.out.println(change);
    }
  }
}
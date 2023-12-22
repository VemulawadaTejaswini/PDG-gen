import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    for (int i = 0; i < (1 << S.length() - 1); i++) {
      int total = 0;
      StringBuilder A = new StringBuilder();
      A.append(S.charAt(0));
      for (int j = 0; j < S.length() - 1; j++) {
        if ((1 & (i >> j)) == 1) {
          int X = Character.getNumericValue(S.charAt(j + 1));
          total += X;
          A.append("+");
        } else {
          int X = Character.getNumericValue(S.charAt(j + 1));
          total -= X;
          A.append("-");
        }
        A.append(S.charAt(j + 1));
      }
      // System.out.println(A);
      int Y = Character.getNumericValue(S.charAt(0));
      //System.out.println(total + Y);
      if (total + Y == 7) {
        System.out.println(A + "=7");
        break;
      }
    }
  }
}

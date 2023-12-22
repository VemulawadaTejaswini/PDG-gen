import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int Q = in.nextInt();
      String S = in.next();

      while (Q-- > 0) {
        int l = in.nextInt() - 1;
        int r = in.nextInt() - 1;
        int countAC = 0;    

        for (int i = l; i < r; ++i) {
          if (S.charAt(i) == 'A' && S.charAt(i + 1) == 'C') {
            ++countAC;
          }
        }

        System.out.println(countAC);
      }
    }
  }
}
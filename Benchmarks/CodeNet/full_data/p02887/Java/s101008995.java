import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      char[] S = in.next().toCharArray();
      char currSlimeColor = S[0];
      int countRemain = 1;
      
      for (int i = 1; i < S.length; ++i) {
        if (S[i] != currSlimeColor) {
          ++countRemain;
          currSlimeColor = S[i];
        }
      }

      System.out.println(countRemain);
    }
  }
}
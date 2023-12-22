import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
  private static int[] S;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    S = new int[3];
    for (int i = 0; i < 3; i++) {
      S[i] = in.nextInt();
    }

    if (S[0] + S[1] == S[2] ||
        S[0] == S[1] + S[2] ||
        S[0] + S[2] == S[1]) {
      System.out.println("Yes");
     } else {
      System.out.println("No");
     }
  }
}
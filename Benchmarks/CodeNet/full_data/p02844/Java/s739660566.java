import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String luckyNum = sc.next();
    int[] s1 = new int[10];
    int[] s2 = new int[100];
    int[] s3 = new int[1000];
    checkStr(luckyNum, 0, "", s1, s2, s3);
    int out = 0;
    for (int i:s3) if (i == 1) out++;
    System.out.println(out);
  }

  public static void checkStr(String luckyNum, int idx, String s, int[] s1, int[] s2, int[] s3) {
    if (s.length() == 3) {
      s3[Integer.valueOf(s)] = 1;
      return;
    }
    if (idx == luckyNum.length()) return;

    if (s.length() == 0) {
      for (int i = idx; i < luckyNum.length()-2; i++) checkStr(luckyNum, i+1, s+luckyNum.charAt(i), s1, s2, s3);
    } else if (s.length() == 1) {
      if (s1[Integer.valueOf(s)] != 1) {
        for (int i = idx; i < luckyNum.length()-1; i++) checkStr(luckyNum, i+1, s+luckyNum.charAt(i), s1, s2, s3);
        s1[Integer.valueOf(s)] = 1;
      }
    } else if (s.length() == 2) {
      if (s2[Integer.valueOf(s)] != 1) {
        for (int i = idx; i < luckyNum.length(); i++) checkStr(luckyNum, i+1, s+luckyNum.charAt(i), s1, s2, s3);
        s2[Integer.valueOf(s)] = 1;
      }
    }
  }
}

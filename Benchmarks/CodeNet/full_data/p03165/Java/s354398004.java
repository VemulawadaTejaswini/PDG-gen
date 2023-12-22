import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static String result = "";
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String s1 = sc.next();
    lcs(s1, s);
    StringBuilder sb = new StringBuilder(result);
      System.out.println(sb.reverse());
  }

  public static void lcs(String s1, String s) {
    int lcs[][] = new int[s.length() + 1][s1.length() + 1];
    for (int i = 0; i < s.length() + 1; i++)
      for (int j = 0; j < s1.length() + 1; j++) {
        if (i == 0 || j == 0)
          lcs[i][j] = 0;
        else if (s.charAt(i - 1) == s1.charAt(j - 1)) {
          lcs[i][j] = lcs[i - 1][j - 1] + 1;
        } else
          lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);

      }
    int i = s.length() , j = s1.length() ;
//      System.out.println(s.length() + " " + s1.length());
        while (i > 0 && j > 0){
        
            if (s.charAt(i - 1) == s1.charAt(j - 1)){
                i--;
                j--;
                result += s.charAt(i);
            } else if (lcs[i - 1][j] > lcs[i][j - 1]){
                i--;
            } else
                j--;
        }
//    System.out.println(lcs[s.length()][s1.length()]);
  }
}


import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String inverse = "";
    for(int i = S.length() - 1; i >= 0; i--) {
      inverse += String.valueOf(S.charAt(i));
    }
    String s1 = "maerd";
    String s2 = "remaerd";
    String s3 = "esare";
    String s4 = "resare";
    String ans = "YES";
    for(int i = 0; i < S.length();) {
      if((i + 5 <= S.length()) && (s1.equals(inverse.substring(i, i + 5)))) {
        i += 5;
      } else if((i + 7 <= S.length()) && (s2.equals(inverse.substring(i, i + 7)))) {
        i += 7;
      } else if((i + 5 <= S.length()) && (s3.equals(inverse.substring(i, i + 5)))) {
        i += 5;
      } else if((i + 6 <= S.length()) && (s4.equals(inverse.substring(i, i + 6)))) {
        i += 6;
      } else {
        ans = "NO";
        break;
      }
    }
    System.out.println(ans);
  }
}
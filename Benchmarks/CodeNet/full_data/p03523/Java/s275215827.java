import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String pat = "AKIHABARA";
    int i = 0;
    int j = 0;

    int lengap = s.length() - pat.length();
    if ((lengap > 0) || (lengap < -4)) {
      System.out.println("NO");
      return;
    }

    while ((i < s.length()) && (j < pat.length())) {
      if (s.charAt(i) == pat.charAt(j)) {
        i++;
        j++;
      } else {
        if (pat.charAt(j) == 'A') {
          j++;
        } else {
          System.out.println("NO");
          return;
        }
      }
    }

    int fin = pat.length() - j;
    if (fin == 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}
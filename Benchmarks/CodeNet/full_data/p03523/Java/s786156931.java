import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String pat = "AKIHABARA";
    int i = 0;
    int j = 0;
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

    System.out.println("YES");

  }
}
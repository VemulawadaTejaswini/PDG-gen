import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    char[] a = sc.nextLine().toCharArray();
    char[] b = sc.nextLine().toCharArray();
    char[] c = sc.nextLine().toCharArray();

    char k = 'a';

    int an = 0;
    int bn = 0;
    int cn = 0;
    int n = a.length + b.length + c.length;

    String w = "";
    LABEL: for (int i = 0; i < n; i++) {
      if (k == 'a') {
        if (an == a.length) {
          w = "A";
          break LABEL;
        } else {
          k = a[an];
          an++;
        }
      } else if (k == 'b') {
        if (bn == b.length) {
          w = "B";
          break LABEL;
        } else {
          k = b[bn];
          bn++;
        }
      } else if (k == 'c') {
        if (cn == c.length) {
          w = "C";
          break LABEL;
        } else {
          k = c[cn];
          cn++;
        }
      }
    }
    
    System.out.println(w);
  }
}
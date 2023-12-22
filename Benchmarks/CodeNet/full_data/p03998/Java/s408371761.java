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
    for (int i = 0; i < n; i++) {
      if (k == 'a') {
        if (an == a.length - 1) {
          w = "A";
          break;
        } else {
          an++;
          k = a[an];
        }
      } else if (k == 'b') {
        if (bn == b.length - 1) {
          w = "B";
          break;
        } else {
          bn++;
          k = b[bn];
        }
      } else {
        if (cn == c.length - 1) {
          w = "C";
          break;
        } else {
          cn++;
          k = c[cn];
        }
      }
    }
    
    System.out.println(w);
  }
}
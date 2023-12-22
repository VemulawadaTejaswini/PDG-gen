import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int k = sc.nextInt();
    char[] c = s.toCharArray();
    for(int i = 0; i < c.length; i++) {
      if(i < c.length - 1) {
        int d = 'z' - c[i] + 1;
        if(k >= d) {
          c[i] = 'a';
          k -= d;
        }
      } else {
        k = (k % 26);
        int d = 'z' - c[i] + 1;
        if(k >= d) {
          k -= d;
          c[i] = (char)('a' + k);
        } else {
          c[i] = (char)(c[i] + k);
        }
      }
    }
    System.out.println(new String(c));
  }
}
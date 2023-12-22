import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] c = S.toCharArray();
    int[] g = new int[c.length + 1];
    g[0] = 0;
    g[1] = 1;
    g[2] = c[0] == c[1] ? 1 : 2;
    for (int i = 3; i < c.length; i++) {
      if (c[i] != c[i - 1]) {
        g[i] = g[i - 1] + 1;
      } else {
        g[i] = g[i - 3] + 2;
      }
    }
    System.out.println(g[c.length]);
  }
}
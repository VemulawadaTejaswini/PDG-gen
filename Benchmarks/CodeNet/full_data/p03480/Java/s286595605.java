import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();

    int min0 = s.length;
    int min1 = s.length;
    for (int i = 0; i < s.length; i++) {
      int l = s.length - i - 1;
      int r = i;
      int m = l == r ? l + 1 : Math.max(l, r);
      if (s[i] == '1') {
        if (m < min1) min1 = m;
      } else {
        if (m < min0) min0 = m;
        
      }
    }
    System.out.println(Math.max(min0, min1));
  }
}

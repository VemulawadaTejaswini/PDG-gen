import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    for (int i = 0; i < s.length(); i++) {
      c[i] += n;
      if (c[i] > 'Z') {
        c[i] -= 'Z';
        c[i] += 'A'-1;
      }
    }
    String k = new String(c);
    System.out.println(k);

  }

}

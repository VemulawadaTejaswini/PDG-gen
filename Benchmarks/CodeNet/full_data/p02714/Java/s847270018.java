import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] s = sc.next().toCharArray();

    int r = 0;
    int g = 0;
    int b = 0;

    for (int i = 0; i < n; i++) {
      if (s[i] == 'R') r++;
      if (s[i] == 'G') g++;
      if (s[i] == 'B') b++;
    }

    int count = 0;

    for (int j = 1; j < n; j++) {
      for (int i = 0; i < n; i++) {
        int k = 2*j-i;
        if (k > n-1) continue;
        if (s[i] == s[j]) continue;
        if (s[i] == s[k]) continue;
        if (s[j] == s[k]) continue;
        count++;
      }
    }

    System.out.println(r*g*b-count);

  }

}

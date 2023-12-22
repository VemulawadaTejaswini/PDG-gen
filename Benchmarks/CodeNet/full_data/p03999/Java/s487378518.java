import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String data = sc.next();
    int n = data.length();

    String[] s = new String[n];

    for (int i = 0; i < n; i++) {
      s[i] = data.substring(i,i+1);
    }

    long ans = 0;

    for (int i = 0; i < (Math.pow(2,n-1)); i++) {
      long sum = 0;
      String k = "";
      for (int j = 0; j < n; j++) {
        k += s[j];
        sum *= 10;
        sum += k.charAt(j)-'0';
        if ((1&i >> j) != 1) {
          // k += "+";
          ans += sum;
          sum = 0;
        }
      }
      // System.out.println(k);
    }

    System.out.println(ans);

  }

}

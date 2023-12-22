import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] w = new String[n];

    for (int i = 0; i < n; i++) {
      w[i] = sc.next();
    }

    boolean ans = true;


    for (int i = 0; i < n-1; i++) {
      String str1 = w[i].substring(w[i].length()-1,w[i].length());
      String str2 = w[i+1].substring(0,1);
      if (!str1.equals(str2)) {
        ans = false;
      }
    }

    Arrays.sort(w);

    for (int i = 0; i < n-2; i++) {
      if (w[i].equals(w[i+1])) {
        ans = false;
      }
    }

    if (ans) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}

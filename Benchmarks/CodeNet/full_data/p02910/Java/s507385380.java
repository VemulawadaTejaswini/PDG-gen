import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    String str = sc.next();
    char[] array = str.toCharArray();
    String ans = "Yes";
    A:for (int j=0; j<array.length; j++) {
      if (j%2 != 0) {
        switch (array[j]) {
          case 'R':
            ans = "No";
            break A;
        }
      } else {
        switch (array[j]) {
          case 'L':
            ans = "No";
            break A;
        }
      }
    }
      System.out.println(ans);
  }
}
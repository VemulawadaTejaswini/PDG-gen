import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int res = 0;
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        char first = s.charAt(i);
        char second = s.charAt(j);
        if (first != second) {
          for (int k = j + 1; k < n; k++) {
            if (j - i == k - j) continue;
            char third = s.charAt(k);
            if (first != third && second != third) {
              res++;
            }
          }
        }
      }
    }
    System.out.println(res);
    sc.close();
  }
}
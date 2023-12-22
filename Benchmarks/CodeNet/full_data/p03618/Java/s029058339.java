import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    long n = A.length();
    HashMap<String, Long> map = new HashMap<String, Long>();
    for(char c = 'a'; c <= 'z'; c++) {
      String s = String.valueOf(c);
      map.put(s, (long)0);
    }
    for(int i = 0; i < n; i++) {
      String s = String.valueOf(A.charAt(i));
      map.put(s, map.get(s) + 1);
    }
    long e = 0;
    for(char c = 'a'; c <= 'z'; c++) {
      String s = String.valueOf(c);
      long m = map.get(s);
      e += ((m * (m - 1)) / 2);
    }
    long ans = 1 + ((n * (n - 1)) / 2) - e;
    System.out.println(ans);
  }
}
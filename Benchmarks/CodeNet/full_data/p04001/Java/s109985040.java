import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S[] = sc.next().split("");
    
    int n = (int)Math.pow(2, S.length - 1);
    
    long total = 0;
    for (int i = 0; i < n; i++) {
      String s = S[0];
      
      for (int j = 0; j < S.length - 1; j++) {
        if ((1&i>>j) == 1) {
          total += Long.parseLong(s);
          s = S[j + 1];
        } else {
          s += S[j + 1];
        }
      }
      total += Long.parseLong(s);
    }
    System.out.println(total);
  }
}
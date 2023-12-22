import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    int result = 0;
    long currentVal = 357;
    for (;;) {
       if (target >= currentVal) {
          result++;
       } else {
          break;
       }
       currentVal = nextVal(currentVal);
    }
    // 出力
    System.out.println(result);
  }
  private static long nextVal(int t) {
      String target = String.valueOf(t);
      for (;;) {
         target = roundUp(target, target.length() - 1);
         if (target.contains("3") && target.contains("5") && target.contains("7")) {
            break;
         }
      }
      return Long.valueOf(target);
  }
 
  private static String roundUp(String t, int n) {
      if (n < 0) {
         return "3" + t;
      }
      String a = t.substring(n,n+1);
      String replace = "";
      if (a.equals("3")) {
          replace = "5";
      } else if (a.equals("5")) {
          replace = "7";
      } else {
          if (n == t.length() - 1) {
             return roundUp(t.substring(0,n) + "3", n - 1);
          } else {
             return roundUp(t.substring(0,n) + "3" + t.substring(n+1, t.length()), n - 1);
          }
      }
      if (n == t.length() - 1) {
        return t.substring(0,n) + replace;
      } else {
        return t.substring(0,n) + replace + t.substring(n+1, t.length());
      }
  }
}
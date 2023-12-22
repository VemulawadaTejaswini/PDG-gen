import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    long ans = func(s);
    
    System.out.println(ans);
  }

  public static long func(String str) {
    int len = str.length();
    if(len == 1) return 0;

    if(str.charAt(0) == str.charAt(len - 1)) {
      if(len == 2) {
        return 0; 
      } else {
        String a = str.substring(1, len - 1);
        return func(a);
      }
    } else {
      if((str.charAt(0) != 'x') && (str.charAt(len - 1) != 'x')) {
        return -1;
      } else {
        if(str.charAt(0) == 'x') {
          String a = str.substring(1);
          long t = 1 + func(a);
          return t;
        } else {
          String a = str.substring(0, len - 1);
          long t = 1 + func(a);
          return t;
        }
      }
    }
  }
}
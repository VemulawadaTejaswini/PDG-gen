import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int p = 0;
    String s1 = "";
    String s2 = "";
    int q = sc.nextInt();
    for(int i = 0; i < q; i++) {
      int f = sc.nextInt();
      if(f == 1) {
        p = 1 - p;
      } else {
        int t = sc.nextInt();
        String c = sc.next();
        if(p == 0) {
          if(t == 1) {
            s1 = s1 + c;
          } else {
            s2 = s2 + c;
          }
        } else {
          if(t == 1) {
            s2 = s2 + c;
          } else {
            s1 = s1 + c;
          }          
        }
      }
    }
    StringBuffer ss = new StringBuffer(s1);
    String ans = ss.reverse().toString() + s + s2;
    if(p == 1) {
      StringBuffer str = new StringBuffer(ans);
      ans = str.reverse().toString();
    }
    System.out.println(ans);
  }
}
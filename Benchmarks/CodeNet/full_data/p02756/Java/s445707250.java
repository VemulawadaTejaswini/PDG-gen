import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int p = 0;
 //   String s1 = "";
 //   String s2 = "";
    Deque<String> deque1 = new ArrayDeque<>();
    Deque<String> deque2 = new ArrayDeque<>();
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
            deque1.push(c);
          } else {
            deque2.push(c);
          }
        } else {
          if(t == 1) {
            deque2.push(c);
          } else {
            deque1.push(c);
          }          
        }
      }
    }
//    StringBuffer ss = new StringBuffer(s1);
//    String ans = ss.reverse().toString() + s + s2;
      StringBuilder sb1 = "";
      StringBuilder sb2 = "";
      for(String str : deque1) {
        sb1.append(str);
      }
      for(String str : deque2) {
        sb2.append(str);
      }
      String ans = "";
      String s1 = new String(sb1);
      String s2 = new String(sb2);
//    if(p == 1) {
//      StringBuffer str = new StringBuffer(ans);
//      ans = str.reverse().toString();
//    }
    System.out.println(ans);
  }
}

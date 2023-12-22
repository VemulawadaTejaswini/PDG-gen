import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String SA = sc.next();
    String SB = sc.next();
    String SC = sc.next();
    
    int ia = 0;
    int ib = 0;
    int ic = 0;
    char next = 'a';
    String ans = "";
    while (true) {
      if (next == 'a') {
        if (ia == SA.length()) {
          ans = "A";
          break;
        }
        next = SA.charAt(ia);
        ia++;
      } else if (next == 'b') {
        if (ib == SB.length()) {
          ans = "B";
          break;
        }
        next = SB.charAt(ib);
        ib++;
      } else { // c
        if (ic == SC.length()) {
          ans = "C";
          break;
        }
        next = SC.charAt(ic);
        ic++;
      }
    }
    
    System.out.println(ans);
  }
}
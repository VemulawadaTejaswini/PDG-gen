import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    StringBuilder aa = new StringBuilder(a);
    StringBuilder bb = new StringBuilder(b);
    StringBuilder cc = new StringBuilder(c);
    char x = aa.charAt(0);
    String ans = "";
    while (true) {
      if (x == 'a') {
        if (aa.length() == 0) {
          ans = "A";
          break;
        } else {
        x = aa.charAt(0);   
        aa.delete(0,1);
        }
      }
      if(x == 'b') {
        if (bb.length() == 0) {
          ans = "B";
          break;
        } else {
        x = bb.charAt(0); 
        bb.delete(0,1);
        }
      }
      if(x == 'c') {
        if (cc.length() == 0) {
          ans = "C";
          break;
        } else {
        x = cc.charAt(0); 
        cc.delete(0,1);
        }
      }
    }

    System.out.println(ans);
    
  }
}

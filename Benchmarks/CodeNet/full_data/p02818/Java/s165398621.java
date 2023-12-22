import java.io.*;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    try {
      // 標準入力受け取り
      Scanner scan = new Scanner(System.in);      
      Long cookie_a     = Long.parseLong(scan.next()); //takahashi cookie
      Long cookie_b     = Long.parseLong(scan.next()); //aoki cookie
      Long play         = Long.parseLong(scan.next()); //kaisu
      
      //算出
      if (cookie_a >= play) {
        cookie_a -= play;
      } else if (cookie_b >= play) {
        cookie_b -= play;
      } else if (cookie_a < play) {
        cookie_b = cookie_b - (play - cookie_a);
        cookie_a -= play;
      }
    
      if (cookie_a < 0) cookie_a = 0L;
      if (cookie_b < 0) cookie_a = 0L;
      
      System.out.print(cookie_a + " " + cookie_b);
      
    } catch (Exception e) {     
      System.out.print("error");
    }
  }
}

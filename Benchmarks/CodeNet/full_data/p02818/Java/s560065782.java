import java.io.*;
import java.util.Scanner;

public class Main {
  
  static int cookie_a; //takahashi cookie
  static int cookie_b; //aoki cookie
  static int play;     //kaisu

  public static void main(String[] args) {

    try {
      cookie();
    } catch (Exception e) {
      cookie_a = 0;
      cookie_b = 0;
    } finally {
      System.out.print(cookie_a + " " + cookie_b);
    }
  }
  
  static void cookie() throws Exception {
  
      // 標準入力受け取り
      Scanner scan = new Scanner(System.in);      
      cookie_a     = Integer.parseInt(scan.next());
      cookie_b     = Integer.parseInt(scan.next());
      play         = Integer.parseInt(scan.next());
    
      for(int i=1; i<=play; i++){
        if(cookie_a <= 0 && cookie_b <= 0){
          return;
        }
        
        if(cookie_a>0){
          cookie_a -= 1;
        } else if (cookie_b > 0){
          cookie_b -= 1;
        }
      }
      
      if(cookie_a < 0){
        cookie_a = 0;
      }
      
      if(cookie_b < 0){
        cookie_b = 0;
      }
  }
}
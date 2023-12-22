
import java.util.*;
 
class Main {
	  static long mod=1_000_000_007;
  public static void main(String[] args) {
	  int flg = 0;
	  String ans = "";
	  Scanner sc = new Scanner(System.in);
      long sx = sc.nextLong();
      long sy = sc.nextLong();
      long tx = sc.nextLong();
      long ty = sc.nextLong();
      
      long x = tx-sx;
      long y = ty-sy;
      for(int i =0;i<x;i++) {
          System.out.print("R");    	  
      }
      for(int i =0;i<y;i++) {
          System.out.print("D");    	  
      }      
      for(int i =0;i<x;i++) {
          System.out.print("L");    	  
      }
      for(int i =0;i<y;i++) {
          System.out.print("U");    	  
      }
      
  }
}
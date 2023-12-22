import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.*;

public class Main {
    public static void main(String args[]) {
     
    Scanner sc = new Scanner(System.in);
 	
      int a,b,c;
      int sum = 0;
      
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      
      sum = a + b + c;
      
      if(sum < 21) {
        System.out.print("win");
      } else {
        System.out.print("bust");
      }
      
    }
}
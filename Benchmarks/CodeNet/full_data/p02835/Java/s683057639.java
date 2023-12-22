import java.util.*;

public class Main {
    public static void main(String args[]) {
     
    Scanner sc = new Scanner(System.in);
 	
      int a,b,c;
      int sum = 0;
      
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      
      sc.close();
      
      sum = a + b + c;
      
      if(sum < 22) {
        System.out.println("win");
      } else if(sum >= 22) {
        System.out.println("bust");
      }
      
    }
}
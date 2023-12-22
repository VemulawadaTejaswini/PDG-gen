import java.util.*;

public class Main {
    public static void main(String args[]) {
     
    Scanner sc = new Scanner(System.in);
    
      int a,b;
      a = sc.nextInt(); 
      b = sc.nextInt(); 

      sc.close();  

      if(a < 0 && b > 0) {
         System.out.print("Zero");

} else if (a < 0 && b < 0) {
 System.out.print("Negative");

} else if(a > 0) {
   System.out.print("Positive");
}

      
    }
}
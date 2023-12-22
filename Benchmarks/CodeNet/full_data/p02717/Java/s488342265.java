import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();
      
      int prevx = x;
      x = y; 
      y = prevx;
      
      int prevxx = x;
      x = z;
      z = prevxx;
            
      System.out.println(x + " " + y + " " + z);  
   }        
}
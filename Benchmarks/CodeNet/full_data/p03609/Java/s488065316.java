import java.util.*;
import java.math.*;

class Main{       
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
    
      int X = sc.nextInt();
      int t = sc.nextInt();
      
      if(t >= X){
          System.out.println(0);
          return;
      }else{
          System.out.println(X-t);
          return;
      }
      
   }
}
        
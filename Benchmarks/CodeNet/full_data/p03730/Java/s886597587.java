import java.util.*;
import java.math.*;

class Main{       
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
    
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      
      for(int a = 0; a < B;a++){
          if((A*a)%B == C){
             System.out.println("YES");   
             return;
          }          
      }
      
     System.out.println("NO");
      
   }
}
        
       
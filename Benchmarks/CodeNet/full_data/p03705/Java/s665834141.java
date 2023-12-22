import java.util.*;

public class Main {                   
    
  public static void main(String[] args) {                     
      
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      
     if(A > B || (N == 1 && A != B)){
         System.out.println(0);
         return;
     }
  
     System.out.println((N-2)*(B-A) + 1);
     
      
  }   
   
}
        
        
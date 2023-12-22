
import java.util.*;

public class Main {    
    
   public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
    
       int A = sc.nextInt();
       int B = sc.nextInt();
       
       if(A == B){
           System.out.println("DRAW");
       }else if(A == 1){
           System.out.println("Alice");
       }else if(B == 1){
           System.out.println("Bob");
       }else{
           System.out.println( A > B ? "Alice":"Bob");
       }       
       
   }   
}
        
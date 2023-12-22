import java.util.*;

public class Main{            
    
     public static void main(String[] args){
      
         Scanner sc = new Scanner(System.in);
         
         int N = sc.nextInt();
         int M = sc.nextInt();                          
         
         String first  = "";
         String second = "";
         
         for(int i = 0;i < M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a == 1){
                first += String.valueOf(b);
            }      
            
            if(b == N){
                second += String.valueOf(a);
            }                        
         }
       
    if(!first.isEmpty() && !second.isEmpty()){
         if(first.contains(second)){
             System.out.println("POSSIBLE");
             return;
         }else{
             System.out.println("IMPOSSIBLE");             
             return;
         }
    }
       
    System.out.println("IMPOSSIBLE");
         
   }              
}       

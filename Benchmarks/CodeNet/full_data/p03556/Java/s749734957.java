import java.util.*;

class Main{            
     
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);  
       
       int N = sc.nextInt();
       
       int max =  Integer.MIN_VALUE;
               
       for(int i = 1 ;i*i <=N;i++){
           max = Math.max(i*i,max);
       }

       System.out.println(max);
      
       
       
       
   }
}
        
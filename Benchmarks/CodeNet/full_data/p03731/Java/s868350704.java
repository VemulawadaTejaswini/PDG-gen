import java.util.*;
import java.math.*;

class Main{       
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int T = sc.nextInt();      
      
      int t[] = new int[N];
      
      for(int i = 0;i < N;i++){
          t[i] = sc.nextInt();
      }
      
      
      int start = t[0];      
      int end = t[0] + T;
      int value = t[0];
      
      int X = 0;
      
      for(int i = 1;i < N;i++){
       if(start <= t[i] && t[i] <= end){
           end = t[i] + T;
       }else{
           X += end - start; 
           start = t[i];
           end = t[i] + T;
       }       
      }
      
      X += end - start;
      
      System.out.println(X);
      
   }
}
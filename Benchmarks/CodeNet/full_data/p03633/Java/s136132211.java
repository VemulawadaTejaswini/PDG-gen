import java.util.*;

public class Main{
      
      public static void main(String[] args) {
          
           Scanner sc = new Scanner(System.in);
       
           int N = sc.nextInt();
           
           long ans = 1L;
           
           for(int i = 0;i < N;i++){
               long T;
               T = sc.nextLong();
               ans = lcm(ans,T);
           }
           
           System.out.println(ans);
           
      }
        
      static long gcd(long a,long b){
          if(b == 0) return a;
          return gcd(b,a%b);
      }
      
      static long lcm(long a,long b){
          long g = gcd(a,b);
          return a/g*b;
      } 
     
}       

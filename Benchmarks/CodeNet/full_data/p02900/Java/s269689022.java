import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long A = sc.nextLong();
   long B = sc.nextLong();
   long ans = 0;
   long N = gcd(A,B);
   
   boolean flg = false;
   for(int k = 1;k<=Math.sqrt(N);k++)
   {
     flg = true;
     if(A%k==0&&B%k==0) 
     {
       for(int i = 2;i<=Math.sqrt(k);i++)
       {
         if(k%i==0) 
         {
           flg = false;
           break;
         }
       }
       if(flg) ans++;
     }
   }
  System.out.println(ans);
 }
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}
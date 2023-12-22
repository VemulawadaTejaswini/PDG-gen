import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   long[] t = new long[N];
   for(int i=0;i<N;i++)  t[i] = sc.nextLong();
   
   long ans =t[0];
   for(int i=1;i<N;i++) 
   {
     if(ans >= t[i]) ans = ans/gcd(ans,t[i]) *t[i];
     else ans =ans/gcd(t[i],ans) * t[i];
   }
   System.out.println(ans);
 }
  static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
}
import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   long M = sc.nextLong();
   long[] a = new long[N+1];
   for(int i =0;i<N;i++) 
   {
     a[i] =sc.nextLong();
   }
   long tmp = a[0]/2;
   for(int i =0;i<N;i++)
   {
     tmp = lcm(tmp,a[i]/2);
     if(tmp>M) break;
   }
   long ans =0;
   for(int i=0;i<N;i++)
   {
     if(tmp%(a[i])==0)
     {
       System.out.println(0);
       return;
     }
   }
   if(M - tmp>=0)
   { 
     ans++;
     ans+= (M - tmp)/(2*tmp);
   }
   System.out.println(ans);
 }
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
 }
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
 }
}
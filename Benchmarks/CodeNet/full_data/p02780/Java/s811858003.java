import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int K = sc.nextInt();
   float[] a = new float[N];
   for(int i=0;i<N;i++) a[i] = sc.nextFloat();
   int ans = 0;
   float mos = 0;
   for(int i=0;i<K;i++) mos+= a[i];
   float tmp =mos;
 
   for(int i =1; i<N-K;i++)
   {
     tmp -= a[i-1];
     tmp += a[i+K-1];
     if(tmp > mos) 
     {
       mos = tmp;
       ans = i;
     }
   }
   float answer = 0.0f;
   for(int i = ans ; i < ans+K ;i++)
   {
     answer += (1+a[i])/2;
   }
   System.out.print(answer);
 }
}
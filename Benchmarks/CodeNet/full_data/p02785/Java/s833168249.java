import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int K = sc.nextInt();
   long[] H = new long[N];
   for(int i=0;i<N;i++) H[i] = sc.nextLong();
   long ans = 0;
   Arrays.sort(H);
   for(int i=0;i<N-K;i++)
   {
     ans+=H[i];
   }
   System.out.println(ans);
 }
}
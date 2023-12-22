import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int K = sc.nextInt();
   int[] hi = new int[N];
   for(int i = 0;i<N;i++)
   {
    hi[i] = sc.nextInt();
   }
   Arrays.sort(hi);
   int count =0;
   int ans = hi[N-1];
   int ex=0;
   while(N-K-count>=0)
   {
    ex = hi[N-1-count] - hi[N-K-count];
    if(ans >ex) ans =ex;
   }
   System.out.println(ans);
 }
}
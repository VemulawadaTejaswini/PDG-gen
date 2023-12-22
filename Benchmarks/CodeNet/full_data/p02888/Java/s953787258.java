import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      int[] L = new int[N];
      int i=0;
      long count =0;
      for(i=0;i<N;i++){
        L[i]=sc.nextInt();
      }
		Arrays.sort(L);
      int j=0;
      
      for(i=N-1;i>0;i--){
        for(j=0;j<i;j++){
        	for(int k=i-1;L[j]+L[k]>L[i]&&k>j;k--){
          		if(j!=k&&i!=k){
           			count++;
          		}
            }
        }
      }
        
      System.out.println(count);

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
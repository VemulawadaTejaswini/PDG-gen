import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[N];
		long sum = 0;
		for(int i=0;i<N;++i){
			a[i] = sc.nextLong() - (i+1);
			sum += a[i];
		}
		long ans1 = 0;
		long ans2 = 0;
		long x = (long)Math.floor((double)sum/(double)N);
		long y = (long)Math.ceil((double)sum/(double)N);
		for(int i=0;i<N;++i){
			ans1 += Math.abs(a[i]-x);
			ans2 += Math.abs(a[i]-y);
		}
		System.out.println(Math.min(ans1,ans2));
		return;
	}
}
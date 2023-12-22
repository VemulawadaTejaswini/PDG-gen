import java.util.*;

public class Main {
	static int P = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		long[] mm = new long[100005];
		mm[0] = 1;
		long[] nn = new long[100005];
		nn[0] = 1;
		for(int i=1;i<mm.length;i++) {
			mm[i] = mm[i-1] * i % P;
			nn[i] = nn[i-1] * fp(i, P-2) % P;
		}
		
		long sum = 0;
		for(int i=n-1;i>=k-1;i--) {

			long d = (a[i]-a[n-1-i]) % P;
			if(d < 0)
				d += P;

			long num = d * mm[i] % P * nn[i-k+1] % P * nn[k-1] % P;
			sum = (sum + num) % P;
		}
		
		System.out.println(sum);
		
	}
	static long fp(int a, int p) {
		
		if(p == 0)
			return 1;
		
		long num = fp(a, p/2);
		if(p % 2 == 0)
			return num * num % P;
		else
			return num * num % P * a % P;
	}
}
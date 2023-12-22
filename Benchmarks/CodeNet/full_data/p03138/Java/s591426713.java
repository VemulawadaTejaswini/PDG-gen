import java.util.Scanner;

public class Main {

	static long a[];
	
	public static long f(long x) {
		long ans = 0;
		int n = a.length;
		for(int i = 0; i < n; ++i) {
			long tmp = x ^ a[i];
			ans += tmp;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		a= new long[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextLong();
		sc.close();
		long max = 0;
		for(int i = 0; i <= k; ++i) {
			max = Math.max(max, f(i));
		}
		
		System.out.println(max);
	}

}

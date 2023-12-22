import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] a = new long[N];
		for(int i = 0;i< N;i++){
			a[i] = sc.nextLong();
		}
		sc.close();
		long l = lcm(a[0],a[1]);
		if(a.length > 2){
			for(int i = 2;i < N;i++){
				l = lcm(l,a[i]);
			}
		}
		long hl = l/2;
		int cnt = 0;
		while(hl < M){
			hl += l;
			cnt++;
		}
		System.out.println(cnt);
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
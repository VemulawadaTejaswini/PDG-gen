import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();
		long[] a = new long[N];
		for(int i = 0;i< N;i++){
			a[i] = sc.nextLong();
		}
		sc.close();
		long l = lcm(a[0],a[1]);
		int flag = 0;
		for(int i = 0;i < N;i++){
			if(l/a[i]%2==0){
				System.out.println(0);
				return;
			}else{
				flag++;
			}
		}
		if(flag == N){
			System.out.println((2*M/l+1)/2);
		}
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

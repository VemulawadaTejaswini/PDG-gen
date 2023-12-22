import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();
		long[] a = new long[N+1];
		long all = 1;
		for(int i = 0;i< N;i++){
			a[i] = sc.nextLong();
			all = all * a[i] / gcd(all, a[i]);
		}
		all = all * a[N-1] / gcd(all, a[N-1]);
		sc.close();
		int flag = 0;
		for(int i = 0;i < N;i++){
			if(all/a[i]%2==0){
				System.out.println(0);
				break;
			}else{
				flag++;
			}
		}
		if(flag == N){
			System.out.println((2*M/all+1)/2);
		}
	}


	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
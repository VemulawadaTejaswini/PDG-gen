import java.util.Scanner;

public class Main{
	static final int mod = 1000000007;
	static long[] fact = new long[4001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		factrial();
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		long sum = 0;

		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				sum += ((fact[a[i]+a[j]+b[i]+b[j]]/fact[a[i]+a[j]])/fact[b[i]+b[j]])%mod;
			}
		}

		System.out.println(sum);
	}

	static void factrial(){
		long f = 1;
		for(int i=1; i<=4000; i++){
			f = (f*i)%mod;
			fact[i] = f;
		}
	}
}
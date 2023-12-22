
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Long> a = new ArrayList<Long>();
		for(int i=0; i<n; i++) {
			a.add(sc.nextLong());
		}
		Collections.sort(a, Collections.reverseOrder());
		long l = a.get(0);
		long m=a.get(a.size()/2);
		System.out.println(l + " " + m);
		sc.close();
	}

	private long comb(long n, long k) {
		return fact(n) / (fact(n-k) * fact(k));
	}

	private long fact(long n) {
		long res = 1;
		for(int i=1; i<=n; i++) {
			res *= i;
		}
		return res;
	}

	private long pow(long n, long k) {
		long res = 1;//k==0
		if(k%2==0) {
			res = pow(n, k/2);
			res = res * res;
		}else {
			res = pow(n, k-1);
			res = res * n;
		}
		return res;
	}
}

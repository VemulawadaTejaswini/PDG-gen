import java.util.*;

public class Main {
	final int MAX = 1000000009;
	Scanner sc = new Scanner(System.in);
	boolean[] makePrime(int m) {
		boolean[] a = new boolean[m + 1];
		Arrays.fill(a, true);
		a[0] = false;
		a[1] = false;
		for(int i = 2; i * i <= m; i++) {
			if(a[i]) {
				for(int j = i * 2; j <= m; j += i) {
					a[j] = false;
				}
			}
		}
		return a;
	}
	void doIt() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] prime = makePrime(m);
		int[] factor = new int[m + 1];
		Arrays.fill(factor, 0);
		long sum = 1, mm = m;
		for(int i = 2; i <= m && mm != 1; i++) {
			//System.out.println(mm);
			if(prime[i]) {
				int num = 0;
				while(mm % i == 0) {
					mm /= i;
					num++;
				}
				sum = sum * h(n, num) % MAX ;
			}
		}
		System.out.println(sum);
	}
	long h(int n, int r){
		double ans = 1;
		for(int i = r; i >= 1; i--) {
			ans = ans * (n + i - 1) / i % MAX;
		}
		//System.out.println(n + " " +  r + " "+  ans);
		return (long)ans;
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}

import java.util.*;

public class Main {
	final int MAX = 1000000007;
	Scanner sc = new Scanner(System.in);
	/*boolean[] makePrime(int m) {
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
	 */
	void doIt() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		long sum = 1, mm = m;
		for(int i = 2; i <= m && mm != 1; i++) {
			//System.out.println(mm);
			int num = 0;
			while(mm % i == 0) {
				mm /= i;
				num++;
			}
			if(num > 0)sum = sum * h(n, num) % MAX;
		}

		System.out.println(sum % MAX);
	}
	long h(int n, int r){
		long ans = 1;
		for(int i = 1; i <= r; i++) {
			ans = (ans * (n + i - 1) / i) % MAX;
		}
		System.out.println(n + " " +  r + " "+  ans);
		return (int)ans;
	}
	
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}

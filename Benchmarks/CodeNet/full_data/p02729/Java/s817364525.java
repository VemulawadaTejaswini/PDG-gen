
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(c(n,2)+c(m,2));
		sc.close();
	}

	private long c(int n, int k) {
		if(n==0|| n<k) return 0;
		return fact(n) / (fact(n-k) * fact(k));
	}
	private long fact(int n) {
		long ans = 1;
		for(int i=1; i<=n; i++) {
			ans *= i;
		}
		return ans;
	}
}

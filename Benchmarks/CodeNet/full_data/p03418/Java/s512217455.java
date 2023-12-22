
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();

		long ans = 0;
		for(int b=1; b<=n; b++) {
			int p = n/b;
			int r = n%b;
			ans += Math.max(0, b-k) * p + Math.max(0, r-(k-1));
		}
		if(k==0) {
			ans -= n;
		}
		System.out.println(ans);
		sc.close();
	}

}

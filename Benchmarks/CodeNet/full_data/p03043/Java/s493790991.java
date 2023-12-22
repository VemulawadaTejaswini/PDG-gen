import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		double ans = 0.0;
		for(int i=1; i<=n; i++) {
			int x = 1;
			int j=i;
			while(j<k) {
				x *= 2;
				j *= 2;
			}
			x *= n;
			ans += (double)1/(double)x;
		}
		System.out.println(ans);
		sc.close();
	}

}

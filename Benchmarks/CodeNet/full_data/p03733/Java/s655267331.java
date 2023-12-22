import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveC();
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextLong();
		long ans = t * n;
		long prev = -t;
		for (int i = 0; i < n; i++) {
			long tmp = sc.nextLong();
			if (tmp - prev < t) {
				ans -= t - tmp + prev;
			}
			prev = tmp;
		}
		System.out.println(ans);
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long m = Long.parseLong(sc.next());
		sc.close();
		long res=(n*2+m)/4;
		res += Math.min(n, m/2);

		System.out.println(res<n?m/2:res);

	}

}

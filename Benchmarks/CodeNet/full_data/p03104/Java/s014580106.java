import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		sc.close();

		long res = sol(b)^sol(a-1);

		System.out.println(res);
	}
	private long sol(long a) {
		if (a % 2 == 1) return (a+1)/2 % 2;
		return (a+2)/2 % 2^(a+1);
	}
}  
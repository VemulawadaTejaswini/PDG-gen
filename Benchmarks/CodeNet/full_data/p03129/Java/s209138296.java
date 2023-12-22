import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();

		if (K <= (N + 1) / 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}

}

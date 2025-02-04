import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<Integer> n = new ArrayList<>(N);
		ArrayList<Integer> p = new ArrayList<>(N);
		for (int i = 0; i < N; i++) {
			n.add(i + 1);
			p.add(i + 1);
		}
		if (!p.isEmpty()) {
			int tmp = p.get(0);
			p.remove(0);
			p.add(tmp);
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			ans += n.get(i) % p.get(i);
		}
		System.out.println(ans);
	}
}
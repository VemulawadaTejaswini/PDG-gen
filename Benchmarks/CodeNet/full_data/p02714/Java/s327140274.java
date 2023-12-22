import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int ans = 0;
		String S = scan.next();
		ArrayList<Integer> R = new ArrayList<Integer>();
		ArrayList<Integer> G = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			char c = S.charAt(i);
			if (c == 'R') {
				R.add(i);
			} else if (c == 'G') {
				G.add(i);
			} else if (c == 'B') {
				B.add(i);
			}
		}

		for (int i = 0; i < R.size(); i++) {
			for (int j = 0; j < G.size(); j++) {
				ans += B.size();

				int r = R.get(i);
				int g = G.get(j);
				int x = Math.abs(r-g);

				if (r < g) {
					if (B.contains(r-x)) {
						ans--;
					}
					if (B.contains(g+x)) {
						ans--;
					}
				} else if (r > g) {
					if (B.contains(g-x)) {
						ans--;
					}
					if (B.contains(r+x)) {
						ans--;
					}
				}

				if ((r+g)%2 == 0 && B.contains((r+g)/2)) {
					ans--;
				}
			}
		}
		System.out.println(ans);
	}

}

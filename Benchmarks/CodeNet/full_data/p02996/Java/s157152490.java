import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pair[] pair = new Pair[n];
		for (int i = 0; i < n; i++) {
			pair[i] = new Pair(sc.nextInt(), sc.nextInt());
		}
		int time = Integer.MAX_VALUE;
		String s = "Yes";
		Arrays.sort(pair, (x, y) -> y.b - x.b);
		for (int i = 0; i < n; i++) {
			if (time >= pair[i].b) {
				time = pair[i].b - pair[i].a;
			} else {
				time = time - pair[i].a;
			}
			if (time < 0) {
				s = "No";
				break;
			}
		}
		System.out.println(s);
	}
}

class Pair {
	int a, b;

	Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}

}
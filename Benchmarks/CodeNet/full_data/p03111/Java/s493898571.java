import java.util.*;

public class Main {
	int N, A, B, C;
	int[] l;

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		A = Integer.parseInt(tokens[1]);
		B = Integer.parseInt(tokens[2]);
		C = Integer.parseInt(tokens[3]);
		l = new int[N];
		for (int i = 0; i < N; ++i) {
			l[i] = Integer.parseInt(in.nextLine());
		}
		in.close();
		Arrays.sort(l);
	}

	int dfs(int current, int a, int b, int c) {
		if (current == N) {
			if (a > 0 && b > 0 && c > 0) {
				return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
			} else {
				return 100000;
			}
		}
		int result = 100000;
		result = Math.min(dfs(current + 1, a, b, c), result);
		result = Math.min(dfs(current + 1, a + l[current], b, c) + 10, result);
		result = Math.min(dfs(current + 1, a, b + l[current], c) + 10, result);
		result = Math.min(dfs(current + 1, a, b, c + l[current]) + 10, result);
		return result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		System.out.println(ins.dfs(0, 0, 0, 0));
	}
}
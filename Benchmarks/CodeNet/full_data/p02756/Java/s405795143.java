import java.util.Scanner;

//AtCoder Beginner Contest 158
//D - String Formation
public class Main {

	static class Value {
		int t;
		int f;
		String c;

		public Value(int t) {
			this.t = t;
		}

		public Value(int t, int f, String c) {
			this.t = t;
			this.f = f;
			this.c = c;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Q = Integer.parseInt(sc.next());
		Value[] query = new Value[Q];
		for (int i = 0; i < Q; i++) {
			int t = Integer.parseInt(sc.next());
			if (t == 1) {
				query[i] = new Value(t);
			} else {
				query[i] = new Value(t, Integer.parseInt(sc.next()), sc.next());
			}

		}
		sc.close();

		StringBuilder ans = new StringBuilder(S);

		int sw = -1; // -1:末尾 1:先頭
		for (int i = 0; i < Q; i++) {
			Value v = query[i];

			if (v.t == 1) {
				sw *= -1;
			} else {
				if (sw == -1) {
					if (v.f == 2) {
						// 末尾
						ans.append(v.c);
					} else {
						// 先頭
						ans = new StringBuilder(v.c + ans.toString());
					}
				} else {
					if (v.f == 2) {
						// 先頭
						ans = new StringBuilder(v.c + ans.toString());
					} else {
						// 末尾
						ans.append(v.c);
					}
				}
			}
		}
		if (sw == -1) {
			System.out.print(ans.toString());
		} else {
			String s = ans.toString();
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
		}
	}
}

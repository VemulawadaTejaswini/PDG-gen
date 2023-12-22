import java.io.*;
import java.util.*;

class Main {

	private static TreeSet<Integer>[] set;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();

		set = new TreeSet[27];
		for (int i = 0; i < 27; i++) {
			set[i] = new TreeSet<>();
		}
		for (int i = 0; i < n; i++) {
			set[(int) s[i] - 'a'].add(i);
		}

		StringBuilder sb = new StringBuilder();
		int Q = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < Q; i++) {
			String[] q = sc.nextLine().split(" ");
			switch (q[0]) {
				case "1":
					int index = Integer.parseInt(q[1]) - 1;
					char c = q[2].charAt(0);
					set[(int) s[i] - 'a'].remove(index);
					s[index] = c;
					set[(int) c - 'a'].add(index);
					break;
				case "2":
					sb.append(count(Integer.parseInt(q[1]) - 1, Integer.parseInt(q[2])))
							.append("\n");
			}
		}
		System.out.print(sb.toString());
	}

	// [l, r)
	private static int count(int l, int r) {
		int a = 0;
		for (int i = 0; i <= 26; i++) {
			Integer index = set[i].ceiling(l);
			if (index == null) continue;
			if (index < r) a++;
		}

		return a;
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		String[] t = new String[q];
		String[] d = new String[q];
		for (int i = 0; i < q; i++) {
			t[i] = sc.next();
			d[i] = sc.next();
		}
		sc.close();

		int left = binarySearchLeft(s, t, d);
		int right = binarySearchRight(s, t, d);
		System.out.println(right - left - 1);
	}

	static int binarySearchLeft(String s, String[] t, String[] d) {
		int start = -1;
		int end = s.length();

		while (Math.abs(end - start) > 1) {
			int mid = (end + start) / 2;
			if (isDeadLeft(s, mid, t, d)) {
				start = mid;
			} else {
				end = mid;
			}
		}
		return start;
	}

	static int binarySearchRight(String s, String[] t, String[] d) {
		int start = -1;
		int end = s.length();

		while (Math.abs(end - start) > 1) {
			int mid = (end + start) / 2;
			if (isDeadRight(s, mid, t, d)) {
				end = mid;
			} else {
				start = mid;
			}
		}
		return end;
	}

	static boolean isDeadLeft(String s, int idx, String[] t, String[] d) {
		for (int i = 0; i < t.length; i++) {
			if (t[i].equals(s.substring(idx, idx + 1))) {
				if ("L".equals(d[i])) {
					idx--;
				} else {
					idx++;
				}
			}
			if (idx < 0) {
				return true;
			}
			if (s.length() <= idx) {
				return false;
			}
		}
		return false;
	}

	static boolean isDeadRight(String s, int idx, String[] t, String[] d) {
		for (int i = 0; i < t.length; i++) {
			if (t[i].equals(s.substring(idx, idx + 1))) {
				if ("L".equals(d[i])) {
					idx--;
				} else {
					idx++;
				}
			}
			if (idx < 0) {
				return false;
			}
			if (s.length() <= idx) {
				return true;
			}
		}
		return false;
	}
}

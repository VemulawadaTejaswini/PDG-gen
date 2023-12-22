import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		String result = "YES";
		int count = 0;
		int tmp1 = 0;
		int tmp2 = 0;
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (p[i] != i + 1) {
				count++;
				if (count == 1) {
					tmp1 = i;
				}
				if (count == 2) {
					tmp2 = i;
				}
			}
		}
		if (count > 2) {
			result = "NO";
		}
		if (count == 2) {
			int tmp = p[tmp1];
			p[tmp1] = p[tmp2];
			p[tmp2] = tmp;
		}
		for (int i = 0; i < n; i++) {
			if (p[i] != i + 1) {
				result = "NO";
			}
		}
		System.out.println(result);
	}
}
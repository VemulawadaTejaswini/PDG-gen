import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[][] countar = new int[2][n];
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				countar[0][i] += countar[0][i - 1];
			}
			if (s.charAt(i) == 'W') {
				countar[0][i]++;
			}
		}
		for (int i = n - 1; i >= 0; i--) {
			if (i != n - 1) {
				countar[1][i] += countar[1][i + 1];
			}
			if (s.charAt(i) == 'E') {
				countar[1][i]++;
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int count = 0;
			if (i > 0) {
				count += countar[0][i - 1];
			}
			if (i < n - 1) {
				count += countar[1][i + 1];
			}
			if (min > count) {
				min = count;
			}
		}
		System.out.println(min);
	}
}

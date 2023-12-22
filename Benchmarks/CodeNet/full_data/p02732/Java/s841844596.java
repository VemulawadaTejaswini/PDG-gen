import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[][] ball = new int[2][n];
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(sc.next());
			ball[0][i] = num;
			ball[1][num - 1]++;
		}
		long defans = 0;
		for (int i = 0; i < n; i++) {
			defans += ((long) ball[1][i] * (ball[1][i] - 1)) / 2;
		}
		defans++;
		for (int i = 0; i < n; i++) {
			System.out.println((long) defans - ball[1][ball[0][i] - 1]);
		}
	}
}
import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int N = s.nextInt();
		String str = s.next();
		char[] c = new char[N];
		int count = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			c[i] = str.charAt(i);
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if (c[j] == ('W')) {
					count++;
				}
			}
			for (int j = i + 1; j < N; j++) {
				if (c[j] == ('E')) {
					count++;
				}
			}
			min = Math.min(min, count);
			count=0;
		}
		System.out.println(min);
	}
}
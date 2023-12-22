import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int N = s.nextInt();
		String str = s.next();
		String[] strArr = new String[N];
		int count = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			strArr[i] = str.substring(i, i + 1);
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if (i != j) {
					if (!strArr[j].equals("E")) {
						count++;
					}
				}
			}
			for (int j = i + 1; j < N; j++) {
				if (!strArr[j].equals("W")) {
					count++;
				}
			}
			min = Math.min(min, count);
			count = 0;
		}

		System.out.println(min);

	}
}
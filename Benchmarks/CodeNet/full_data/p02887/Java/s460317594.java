import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int count = 1;

		char[] array = S.toCharArray();
		for (int a = 0; a < N - 1; a++) {
			for (int b = a+1; b < N; b++) {
				if (array[a] == array[b]) {
					break;
				} else {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
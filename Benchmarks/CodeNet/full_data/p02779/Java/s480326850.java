import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] input = new Integer[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		Arrays.asList(input).sort((x, y) -> x - y);
		int tmp = input[0];
		boolean res = true;
		for (int i = 1; i < N; i++) {
			if (tmp == input[i]) {
				res = false;
				break;
			}
			tmp = input[i];
		}
		if (res) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}
}
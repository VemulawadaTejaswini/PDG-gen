import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		Arrays.sort(input);
		int beginIndex = 0;
		int endIndex = 0;
		int res = 1;
		while (endIndex < N - 1) {
			if (input[endIndex] - input[beginIndex] < 3) {
				if (res < endIndex - beginIndex + 1) {
					res = endIndex - beginIndex + 1;
				}
			}
			if (input[endIndex + 1] - input[beginIndex] < 3) {
				endIndex++;
				continue;
			}
			if (beginIndex == endIndex) {
				beginIndex++;
				endIndex++;
			}
			beginIndex++;
		}
		if (beginIndex != N && input[N - 1] - input[beginIndex] < 3) {
			endIndex = N - 1;
			if (res < endIndex - beginIndex + 1) {
				res = endIndex - beginIndex + 1;
			}
		}
		System.out.println(res);
	}
}

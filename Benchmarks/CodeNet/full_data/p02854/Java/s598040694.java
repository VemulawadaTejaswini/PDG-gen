import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		double center = 0;
		for (int i : input) {
			center += i;
		}
		center /= 2;

		int min1 = 0;
		int min2 = 0;

		for (int i = 0; i < input.length; i++) {
			min1 += input[i];
			if (min1 >= center) {
				break;
			}
		}
		for (int i = input.length - 1; i >= 0; i--) {
			min2 += input[i];
			if (min2 >= center) {
				break;
			}
		}
		int min = Math.min(min1, min2);

		int res = (int) Math.ceil(Math.abs(center - min));

		System.out.print(res);
	}
}

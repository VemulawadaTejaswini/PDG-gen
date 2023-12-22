import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		boolean plus = true;
		int first = 0;
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			if (plus) {
				first += input[i];
			} else {
				first -= input[i];
			}	
			plus = !plus;
		}
		System.out.print(first + " ");
		for (int i = 0; i < input.length - 1; i++) {
			System.out.print((input[i] - first / 2) * 2 + " ");
			first = (input[i] - first / 2) * 2;
		}
	}
}
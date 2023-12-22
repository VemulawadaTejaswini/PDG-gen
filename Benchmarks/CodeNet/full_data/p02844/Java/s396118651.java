import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String[] input = S.split("");
		int[] ansArray = new int[1000];
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				for (int k = j + 1; k < input.length; k++) {
					int cipher = Integer.parseInt(input[i] + input[j] + input[k]);
					ansArray[cipher] = 1;
				}
			}
		}
		int res = 0;
		for (int count : ansArray) {
			res += count;
		}
		System.out.print(res);
	}
}

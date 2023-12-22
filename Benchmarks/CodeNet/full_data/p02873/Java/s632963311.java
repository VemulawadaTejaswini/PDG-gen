import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("");
		long numR = 0;
		long numL = 0;
		long res = 0;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i].equals("<")) {
				res += numL;
				numL++;
			} else {
				res += numR;
				numR++;
				if (input[i + 1].equals("<")) {
					res += Math.max(numL, numR);
					numL = 0;
					numR = 0;
				}
			}
		}
		if (input[input.length - 1].equals("<")) {
			res += numL;
			numL++;
			res += numL;
		} else {
			res += numR;
			numR++;
			res += Math.max(numL, numR);
		}
		System.out.println(res);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] inputSplit = S.toCharArray();
		for (int i = 0; i < inputSplit.length; i++) {
			if ((int) inputSplit[i] + N > 90) {
				System.out.print((char) ((int) inputSplit[i] + N - 26));
			} else {
				System.out.print((char) ((int) inputSplit[i] + N));
			}
		}
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] SSplit = S.split("");
		int res = 0;
		for (int i = 0; i < SSplit.length / 2; i++) {
			if (!SSplit[i].equals(SSplit[SSplit.length - i - 1])) {
				res++;
			}
		}
		System.out.print(res);
	}
}

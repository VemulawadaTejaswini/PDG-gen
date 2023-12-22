import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLine = sc.nextLine();
		long K = Long.parseLong(inputLine);
		long counter = 1;

		int pre = 1, suf = 0;
		for (long i = 1; i <= K; ++i) {
			System.out.print(counter++);
			for (int j = 0; j < suf; ++j)
				System.out.print('9');
			System.out.println();
			if (counter / (10 * pre) >= 1) {
				if(suf == 0 || suf == 11) {
					counter = pre;
					suf++;
				} else {
					counter = pre;
					++pre;
					++suf;
				}
			}
		}
	}
}
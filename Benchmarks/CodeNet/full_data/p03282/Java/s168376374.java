
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] S = sc.next().toCharArray();
		long K = sc.nextLong();


		for (int i = 0; i < S.length; i++) {
			if (S[i] != '1') {
				System.out.println(S[i]);
				break;
			}else {
				if (i == K - 1) {
					System.out.println(S[i]);
					break;
				}
			}
		}

	}
}

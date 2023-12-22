import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] abs = new int[N];

		for (int i = 0; i < N; i++) {
			int num = scan.nextInt();
			abs[num]++;
		}

		boolean flag = true;
		int num = 0;
		for (int i = (N + 1) % 2; i < N; i += 2) {
			if (i == 0) {
				if (abs[0] != 1) {
					flag = false;
					break;
				}
			}
			else if (abs[i] != 2) {
				flag = false;
				break;
			}
			else num++;
		}

		BigInteger answer = BigInteger.valueOf(2).modPow(BigInteger.valueOf(num), BigInteger.valueOf(1000000007));
		if (flag) System.out.println(answer);
		else System.out.println(0);
 	}
}
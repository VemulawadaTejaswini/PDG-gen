import java.util.Scanner;

public class Main {

	static final long CONST = 1000000007;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numN = scan.nextInt();
		long numK = scan.nextLong();

		int[] numAList = new int[numN];

		int[] little1 = new int[numN];
		int[] little2 = new int[numN];

		for (int i = 0; i < numN; i++) {
			numAList[i] = scan.nextInt();
		}

		for (int i = 0; i < numN; i++) {
			int count = 0;
			for (int j = 0; j < numN; j++) {
				if (numAList[i] > numAList[j]) {
					count++;
				}
			}
			little1[i] = count;
		}

		for (int i = 0; i < numN; i++) {
			int count = 0;
			for (int j = i + 1; j < numN; j++) {
				if (numAList[i]> numAList[j]) {
					count++;
				}
			}
			little2[i] = count;
		}

		long sum1 = 0;
		long sum2 = 0;

		for (int i = 0; i < numN; i++) {
			sum1 += little1[i];
			sum2 += little2[i];
		}

		long result1 = ((long) sum1 * (((numK * (numK -1)) / 2L) % CONST)) % CONST;
		long result2 = ((long) sum2 * (numK % CONST)) % CONST;

		System.out.println((result1 + result2) % CONST);
	}
}

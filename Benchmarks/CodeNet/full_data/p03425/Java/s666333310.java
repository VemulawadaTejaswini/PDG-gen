import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numPpl = Integer.parseInt(scanner.nextLine());
		int M = 1;
		int A = 2;
		int R = 4;
		int C = 8;
		int H = 16;
		int[] numMARCH = new int[17];
		int[] comb3Chars = {
				M + A + R,
				M + A + C,
				M + A + H,
				M + R + C,
				M + R + H,
				M + C + H,
				A + R + C,
				A + R + H,
				A + C + H,
				R + C + H,
				};

		for (int pIdx = 0; pIdx < numPpl; pIdx++) {
			char firstChar = scanner.nextLine().charAt(0);
			if(firstChar == 'M') numMARCH[M]++;
			if(firstChar == 'A') numMARCH[A]++;
			if(firstChar == 'R') numMARCH[R]++;
			if(firstChar == 'C') numMARCH[C]++;
			if(firstChar == 'H') numMARCH[H]++;
		}

		long result = 0;
		for (int comb3Char: comb3Chars) {
			int tmpResult = 1;
			if ((comb3Char & M) > 0) tmpResult = numMARCH[M] == 0 ? 0 : tmpResult * numMARCH[M];
			if ((comb3Char & A) > 0) tmpResult = numMARCH[A] == 0 ? 0 : tmpResult * numMARCH[A];
			if ((comb3Char & R) > 0) tmpResult = numMARCH[R] == 0 ? 0 : tmpResult * numMARCH[R];
			if ((comb3Char & C) > 0) tmpResult = numMARCH[C] == 0 ? 0 : tmpResult * numMARCH[C];
			if ((comb3Char & H) > 0) tmpResult = numMARCH[H] == 0 ? 0 : tmpResult * numMARCH[H];
			result += tmpResult;
		}
		System.out.println(result);
	}
}

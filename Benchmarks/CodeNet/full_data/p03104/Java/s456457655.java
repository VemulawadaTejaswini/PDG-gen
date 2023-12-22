
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long A = reader.nextLong();
		long B = reader.nextLong();
		String binB = Long.toBinaryString(B);
		int[] bin = new int[binB.length()];

		if (A % 2 == 1) {
			String binC = Long.toBinaryString(A);
			int size = binC.length();
			for (int i = 0; i < size; i++) {
				bin[i] += Character.getNumericValue(binC.charAt(size - i - 1));
			}
		}
		bin[0] = (int) (B - A + 1) / 2;

		if (B % 2 == 0) {
			for (int i = 0; i < binB.length(); i++) {
				bin[i] += Character.getNumericValue(binB.charAt(binB.length() - i - 1));
			}
		}
		String binAns = "";
		for (int i = 0; i <  binB.length(); i++) {
			binAns = (bin[i]%2) + binAns;
		}
		long ans = Long.parseLong(binAns, 2);
		System.out.print(ans);
		reader.close();
	}
}


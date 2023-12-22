import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long A = reader.nextLong();
		long B = reader.nextLong();
		String binB = Long.toBinaryString(B);
		int[] bin = new int[binB.length()];
		while (B >= A) {
			String binC = Long.toBinaryString(B);
			int size = binC.length();
			for (int i = 0; i < size; i++) {
				bin[i] += Character.getNumericValue(binC.charAt(size - i - 1));
			}	
			B--;
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


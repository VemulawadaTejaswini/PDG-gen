import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numN = s.nextInt();
		long[] nums = new long[numN];
		for (int i = 0; i < numN; i++) {
			nums[i] = s.nextInt();
		}
		String judge = "No";
		for (int i = 0; i < numN; i++) {
			for (int j = 0; j < numN; j++) {
				if (i != j) {
					long judgeAB = nums[i] ^ nums[j];
					if (nums[i] == judgeAB) {
						judge = "Yes";
						break;
					}
				}
			}
			System.out.println(judge);

		}

	}
}

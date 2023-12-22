import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static final long CONST = 100000007L;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numN = scan.nextInt();
		long[] numH = new long[numN];

		for (int i = 0; i < numN; i++) {
			numH[i] = scan.nextLong();
		}

		ArrayList<Integer> list = new ArrayList<>();

		int count = 0;

		for (int i = 1; i < numN; i++) {
			if (numH[i] <= numH[i - 1]) {
				count++;
			} else {
				list.add(count);
				count = 0;
			}
		}

		list.add(count);

		int max = 0;
		for (int num: list) {
			if (num > max) {
				max = num;
			}
		}

		System.out.println(max);
	}
}

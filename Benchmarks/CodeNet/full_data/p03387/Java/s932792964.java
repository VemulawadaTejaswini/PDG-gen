import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n0 = 0;
		int n1 = 0;

		int[] num = new int[3];

		for (int i = 0; i < 3; i++) {
			num[i] = s.nextInt();
		}
		Arrays.sort(num);

		if (num[0] % 2 == 0 && num[1] % 2 == 0) {
			if (num[2] % 2 == 0) {
				n0 = (num[2] - num[0]) / 2;
				n1 = (num[2] - num[1]) / 2;
				System.out.println(n0 + n1);
			} else {
				n0 = (num[2] - num[0]) / 2;
				n1 = (num[2] - num[1]) / 2;
				System.out.println(n0 + n1 + 1);
			}
		} else {
			if (num[2] % 2 == 0) {
				n0 = (num[2] - num[0]) / 2;
				n1 = (num[2] - num[1]) / 2;
				System.out.println(n0 + n1 + 2);
			} else {
				n0 = (num[2] - num[0]) / 2;
				n1 = (num[2] - num[1]) / 2;
				System.out.println(n0 + n1);
			}
		}
	}
}

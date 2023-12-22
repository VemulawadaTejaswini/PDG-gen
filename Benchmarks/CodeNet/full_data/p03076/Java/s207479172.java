import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] dishes = new int[5];

		for (int i = 0; i < 5; i++) {
			dishes[i] = Integer.parseInt(sc.next());
		}

		int one = 10;
		int oneIdx = 0;
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			if (dishes[i] % 10 != 0 && dishes[i] % 10 < one) {
				one = dishes[i] % 10;
				oneIdx = i;
			}
		}

		for (int i = 0; i < 5; i++) {
			if (i == oneIdx) {
				sum += dishes[i];
			} else {
				sum += Math.ceil(dishes[i] / 10.0) * 10;
			}
		}

		System.out.println(sum);

	}
}
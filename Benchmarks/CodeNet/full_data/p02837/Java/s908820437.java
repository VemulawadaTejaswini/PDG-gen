import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max = 0;
		int[] honest = new int[n];
		int[] unkind = new int[n];

		for (int i = 0, a, x, y; i < n; i++) {
			a = scanner.nextInt();
			for (int j = 0; j < a; j++) {
				x = scanner.nextInt() - 1;
				y = scanner.nextInt();
				if (y == 1) {
					honest[i] |= personBit(x);
				} else {
					unkind[i] |= personBit(x);
				}
			}
		}

		for (int i = 1, white, black; i < 1 << n; i++) {
			if (Integer.bitCount(i) <= max)
				continue;
			white = sumBit(honest, i, n);
			black = sumBit(unkind, i, n);
			if ((~i & white) == 0 && (i & black) == 0)
				max = Integer.bitCount(i);
		}
		System.out.println(max);
	}

	static int personBit(int n) {
		return 1 << n;
	}

	static int sumBit(int[] arr, int bit, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if ((bit & personBit(i)) > 0) {
				sum |= arr[i];
			}
		}
		return sum;
	}

}

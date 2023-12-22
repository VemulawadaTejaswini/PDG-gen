import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		int[] nameCount = new int[5];
		for (int i = 0; i < inN; i++) {
			int index = getIndex(stdin.next());
			if (index >= 0) {
				nameCount[index]++;
			}
		}

		final char[][] firstArray = {
			{
				'M', 'A', 'R'
			}, {
				'M', 'A', 'C'
			}, {
				'M', 'A', 'H'
			}, {
				'M', 'R', 'C'
			}, {
				'M', 'R', 'H'
			}, {
				'M', 'C', 'H'
			}, {
				'A', 'R', 'C'
			}, {
				'A', 'R', 'H'
			}, {
				'A', 'C', 'H'
			}, {
				'R', 'C', 'H'
			}
		};

		long count = 0;
		for (char[] array : firstArray) {
			long pattern = 1;
			for (char first : array) {
				pattern *= nameCount[getIndex(first)];
			}
			count += pattern;
		}

		System.out.println(count);
	}

	private static int getIndex(char first) {
		switch (first) {
			case 'M':
				return 0;
			case 'A':
				return 1;
			case 'R':
				return 2;
			case 'C':
				return 3;
			case 'H':
				return 4;
			default:
				return -1;
		}
	}

	private static int getIndex(String name) {
		char first = name.charAt(0);
		return getIndex(first);
	}
}

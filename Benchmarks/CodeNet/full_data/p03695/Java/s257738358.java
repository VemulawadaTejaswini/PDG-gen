import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		int colors[] = new int[8];
		int free = 0;

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if (a[i] / 400 < 8) {
				colors[a[i] / 400]++;
			} else {
				free++;
			}
		}

		int max = calcMax(free, colors);
		int min = 0;
		if (free == n) {
			min = 1;
		} else {
			min = calcMin(free, colors);
		}

		System.out.println(min + " " + max);

	}

	private static int calcMax(int count, int[] colors) {
		int max = 0;
		int newColors[] = new int[8];
		System.arraycopy(colors, 0, newColors, 0, colors.length);
		for (int i = 0; i < count; i++) {
			if (newColors[i] == 0) {
				newColors[i]++;
			}
		}

		for (int i = 0; i < newColors.length; i++) {
			if (newColors[i] > 0) {
				max++;
			}
		}
		return max;
	}

	private static int calcMin(int count, int[] colors) {
		int min = 0;
		int newColors[] = new int[8];
		System.arraycopy(colors, 0, newColors, 0, colors.length);
		for (int i = 0; i < count; i++) {
			if (newColors[i] != 0) {
				newColors[i]++;
			}
		}

		for (int i = 0; i < newColors.length; i++) {
			if (newColors[i] > 0) {
				min++;
			}
		}
		return min;
	}

}

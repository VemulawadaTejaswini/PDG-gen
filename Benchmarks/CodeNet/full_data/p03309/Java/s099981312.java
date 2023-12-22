import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int positiveNum = 0;
		int negativeNum = 0;

		long sadness = 0;

		int[] positiveX = new int[(int) (Math.pow(10, 9) + 1)];
		for (int i = 0; i <= Math.pow(10, 9); i++) {
			positiveX[i] = 0;
		}

		int[] negativeX = new int[(int) (Math.pow(10, 9) + 1)];
		for (int i = 0; i <= Math.pow(10, 9); i++) {
			negativeX[i] = 0;
		}

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			int value = input - (i + 1);

			if (value > 0) {
				positiveNum++;
				sadness += value;
			} else {
				negativeNum++;
				sadness -= value;
			}

			if (0 <= value && value <= Math.pow(10, 9)) {
				positiveX[value]++;
			} else if (-1 >= value && value >= -Math.pow(10, 9)) {
				negativeX[-value]++;
			}
		}

		long minSadness = sadness;

		long copySadness = sadness;
		long CopyPositiveNum = positiveNum;
		long CopyNegativeNum = negativeNum;

		int b = 1;
		while (true) {
			sadness -= positiveNum;
			sadness += negativeNum;
			positiveNum -= positiveX[b];
			negativeNum += positiveX[b];
			if (sadness < minSadness) {
				minSadness = sadness;
			} else {
				break;
			}
			b++;
		}

		b = 1;
		CopyPositiveNum += positiveX[0];
		CopyNegativeNum -= positiveX[0];
		while (true) {
			copySadness += CopyPositiveNum;
			copySadness -= CopyNegativeNum;
			CopyPositiveNum += negativeX[b];
			CopyNegativeNum -= negativeX[b];
			if (copySadness < minSadness) {
				minSadness = copySadness;
			} else {
				break;
			}
			b++;
		}

		System.out.println(minSadness);
	}

}

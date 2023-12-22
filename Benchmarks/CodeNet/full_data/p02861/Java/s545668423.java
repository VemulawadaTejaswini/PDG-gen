
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double[] x = new double[n];
		double[] y = new double[n];
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			array[i] = i;
		}
		double sum = 0;
		int time = 0;
		do {
			time++;
			double tmp = 0;
			for (int i = 0; i < n - 1; i++) {
				Math.pow(x[array[i]] - x[array[i + 1]], 2);
				double a = Math.pow(x[array[i]] - x[array[i + 1]], 2);
				double b = Math.pow(y[array[i]] - y[array[i + 1]], 2);
				tmp += Math.sqrt(a + b);
			}
			sum += tmp;
		} while (nextPermutation(array));
		System.out.println(sum / time);
		sc.close();
	}

	//順列全列挙
	//nが10を超えてくると間に合わなくなる
	static boolean nextPermutation(int[] array) {
		// Find longest non-increasing suffix
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i])
			i--;
		// Now i is the head index of the suffix

		// Are we at the last permutation already?
		if (i <= 0)
			return false;

		// Let array[i - 1] be the pivot
		// Find rightmost element that exceeds the pivot
		int j = array.length - 1;
		while (array[j] <= array[i - 1])
			j--;
		// Now the value array[j] will become the new pivot
		// Assertion: j >= i

		// Swap the pivot with j
		int temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;

		// Reverse the suffix
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}

		// Successfully computed the next permutation
		return true;
	}
}
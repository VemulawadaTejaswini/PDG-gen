import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		String[] tokens = in.nextLine().split(" ");
		int[] values = new int[num];
		int[] sortedValues = new int[num];
		for (int i = 0; i < num; ++i) {
			values[i] = Integer.parseInt(tokens[i]);
			sortedValues[i] = values[i];
		}
		Arrays.sort(sortedValues);
		for (int i = 0; i < num; ++i) {
			System.out.println(getMedium(i, values, sortedValues));
		}
		in.close();
	}

	public static int getMedium(int skipIndex, int[] values, int[] sortedValues) {
		int lowerMedium = sortedValues[sortedValues.length / 2 - 1];
		int largerMedium = sortedValues[sortedValues.length / 2];
		if (values[skipIndex] < lowerMedium) {
			return largerMedium;
		} else if (values[skipIndex] > largerMedium) {
			return lowerMedium;
		} else if (values[skipIndex] == lowerMedium) {
			return largerMedium;
		} else {
			return lowerMedium;
		}
	}
}

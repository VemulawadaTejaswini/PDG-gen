import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		double[] nums = new double[cnt];
		for (int i = 0; i < cnt; i++) {
			nums[i] = sc.nextInt();
		}

		Arrays.sort(nums);

		int process = 0;
		double convert = -1;

		while (true) {
			double a = 0;
			double b = 0;
			if (convert != -1) {
				if (process == cnt - 1) {
					a = nums[process];
					b = convert;
					process = process + 1;
				} else {
					if (nums[process + 1] > convert) {
						a = nums[process];
						b = convert;
						process = process + 1;
					} else {
						a = nums[process];
						b = nums[process + 1];
						process = process + 2;
					}
				}
			} else {
				a = nums[process];
				b = nums[process + 1];
				process = process + 2;
			}
			convert = (a + b) / 2;
			if (process == cnt) {
				break;
			}
		}
		System.out.println(convert);
	}

}

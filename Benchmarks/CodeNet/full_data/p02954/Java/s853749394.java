import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int nums[] = new int[str.length()];

		String ch = "";
		int max = 1;
		int len = 1;
		for (int i = 0; i < str.length(); i++) {
			if (i != 0) {
				if (ch.equals(str.substring(i, i + 1))) {
					len++;
				} else {
					if (max < len) {
						max = len;
					}
					len = 1;
				}
			}
			ch = str.substring(i, i + 1);
			nums[i] = 1;
		}
		if (max < len) {
			max = len;
		}

		int tempNums[] = new int[nums.length];

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.substring(j, j + 1).equals("L")) {
					tempNums[j - 1] = tempNums[j - 1] + nums[j];
				} else {
					tempNums[j + 1] = tempNums[j + 1] + nums[j];
				}
			}
			nums = tempNums;
			tempNums = new int[nums.length];
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("");

	}

}
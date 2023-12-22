import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n + 1];
		for (int i = 1; i < n; i++) {
			int next = scan.nextInt();
			nums[next] = ++nums[next];
		}
		for (int j = 0; j < n; j++) {
			System.out.println(nums[j + 1]);
		}

		scan.close();
	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		ArrayList<Integer> nums = new ArrayList<>();
		int i = 0;
		while(i < N) {
			nums.add(scn.nextInt());
			i++;
		}

		for (int num:nums) {
			if (nums.contains(num)) {
				System.out.println("No");
				break;
			} else {
				System.out.println("Yes");
			}

		}

	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	private List<Integer> nums = new ArrayList<>();

	public static void main(String[] args) {
		Main ins = new Main();
		ins.init();
		Scanner in = new Scanner(System.in);
		int input = Integer.parseInt(in.nextLine());
		System.out.println(ins.calc(input));

		in.close();
	}

	private int calc(int num) {
		int count = 0;
		int n = num;

		for (Integer i : nums) {
			if (n >= i) {
				count += n / i;
				n = n % i;
				// System.out.println(n + ", " + i + ", " + count);
			}
		}
		count += n;
		return count;
	}

	private void init() {
		for (int i = 6; i <= 100000; i = i * 6) {
			nums.add(i);
		}
		for (int i = 9; i <= 100000; i = i * 9) {
			nums.add(i);
		}
		Collections.sort(nums);
		Collections.reverse(nums);
		
//		for(int i = 0; i < nums.size(); ++i) {
//			System.out.println(nums.get(i));
//		}
	}

}
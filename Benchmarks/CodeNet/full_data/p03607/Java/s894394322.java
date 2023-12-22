import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = s.nextInt();
		}

		List<Integer> list = new ArrayList<>();
		for (int num : nums) {
			if (!list.contains(num)) {
				list.add(num);
			}else{
				int idx=list.indexOf(num);
				list.remove(idx);
			}

		}

		int[] newNums = new int[list.size()];
		for (int i = 0; i < newNums.length; i++) {
			newNums[i] = list.get(i);
		}
		System.out.println(newNums.length);
	}

}

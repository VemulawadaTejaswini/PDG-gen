import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		List<Integer> nums = new ArrayList<>(n);
		String[] tokens = in.nextLine().split(" ");
		for (int i = 0; i < n; ++i) {
			nums.add(Integer.parseInt(tokens[i]));
		}
		// bを0としたときの差分分布をとる
		Map<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < n; ++i) {
			int diff = nums.get(i) - (i + 1);
			if (!count.containsKey(diff)) {
				count.put(diff, 1);
			} else {
				count.put(diff, count.get(diff) + 1);
			}
		}
		// 最大のカウントを取得する
		int maxCount = Integer.MIN_VALUE;
		int target = 0;
		for (Integer key : count.keySet()) {
			//System.out.println("diff: " + key + ", count: " + count.get(key));
			if (maxCount < count.get(key)) {
				maxCount = count.get(key);
				target = key;
			}
		}
		int b = target;
		int result = 0;
		for (int i = 0; i < n; ++i) {
			int diff = Math.abs(nums.get(i) - (b + i + 1));
//			System.out.println(nums.get(i) + ", " + b + ", " + diff);
			result += diff;
		}
		System.out.println(result);
		in.close();
	}

}
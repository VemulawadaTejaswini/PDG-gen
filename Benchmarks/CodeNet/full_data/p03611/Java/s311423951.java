import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> nums = new HashMap<Integer,Integer>();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			add(nums, num);
			add(nums, num + 1);
			add(nums, num - 1);
		}
		Collection<Integer> list = nums.values();
		int ans = 0;
		for(Integer i : list) {
			if(i > ans) ans = i;
		}
		System.out.println(ans);
	}
	static void add(Map<Integer, Integer> map, Integer num) {
		if(map.containsKey(num)) {
			map.put(num, map.get(num) + 1);
		} else {
			map.put(num, 1);
		}
	}
}
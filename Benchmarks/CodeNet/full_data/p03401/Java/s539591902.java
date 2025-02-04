import java.io.*;
import java.util.*;
public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] nums = new int[num];
		for(int i = 0; i < num; i++) {
			nums[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < num; i++) {
			if(map.containsKey(nums[i])) {
				System.out.println(map.get(nums[i]));
				continue;
			}
			int total = 0;
			for(int j = 0; j < num + 1; j++) {
				if(j == 0) {
					if(i == 0) total += Math.abs(nums[1]);
					else total += Math.abs(nums[j]);
				}
				else if(j == num) {
					if(i == num - 1) total += Math.abs(nums[num - 2]);
					else total += Math.abs(nums[num - 1]);
				}
				else if(j == i) {
					continue;
				}
				else {
					if(j - 1 == i) {
						//if(i == 0 && j == 1) total += Math.abs(nums[j]);
						if(j - 2 >= 0) 
							total += Math.abs(nums[j] - nums[j - 2]);
					}
					else total += Math.abs(nums[j] - nums[j - 1]);
				}
			}
			System.out.println(total);
			map.put(nums[i], total);
		}
	}
}
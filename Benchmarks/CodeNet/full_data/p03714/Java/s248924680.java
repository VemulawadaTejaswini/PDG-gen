import java.util.*;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[sc.nextInt()*3];
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		Main soln = new Main();
		long[][] cache = new long[nums.length][nums.length/3];
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length/3; j++) {
				cache[i][j] = Long.MIN_VALUE;
			}
		}
		System.out.println(soln.deep(cache, nums, 0, 0));
	}

	private long deep(long[][] cache, int[] nums, int ptr, int cnt) {
		if(cnt==nums.length/3) return calc(nums);
		if(ptr>(nums.length/3*2)+cnt) return Long.MIN_VALUE;
		//if(cache[ptr][cnt]>Long.MIN_VALUE) return cache[ptr][cnt];

		long res = 0;
		int temp = nums[ptr];
		nums[ptr] = 0;
		long res1 = deep(cache, nums, ptr+1, cnt+1);
		nums[ptr] = temp;
		long res2 = deep(cache, nums, ptr+1, cnt);
		res = Math.max(res1, res2);
		cache[ptr][cnt] = res;
		return res;
	}

	private long calc(int[] nums) {
		long res = 0;
		int cnt = 0;
		for(int i=0; i<nums.length; i++) {
			if(cnt<nums.length/3) {
				res += nums[i];
				if(nums[i]>0) cnt++;
			}
			else {
				res -= nums[i];
			}
		}
		return res;
	}
}
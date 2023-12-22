import java.util.*;

public class Main {
	
	/*
	 * default function
	 * */	
	int ni() {
		return cin.nextInt();
	}
	
	long nl() {
		return cin.nextLong();
	}
	
	String line() {
		return cin.nextLine();
	}
	
	void println(String str) {	
		System.out.println(str);
	}
	
	void print(String str) {
		System.out.print(str);
	}
	
	/*
	 * default variable
	 */
	
	static final int MOD = 1000000007;
	
	Scanner cin = new Scanner(System.in);	
	String  output;
	
	public static void main(String[] args) {			
		new Main().run();						
	}
	
	/* default above */		
	public void run() {
			
		input();
		/* 
		 * start
		 */	
		
		
		
		if (nums[0] == 0) {
			solve1();
			solve2();
		} else {
			solve1();
			solve3();
			solve4();
		}
		
		/*
		 * finish
		 */
		
		output = cnt+"";
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	
	int N;
	int[] nums;
	long cnt;
	
	void input() {
		
		cnt = 0;
		
		N = ni();
		nums = new int[N];
		
		for (int i = 0; i < N; i ++) {
			nums[i] = ni();
		}
	}
	
	void solve2() {
		
		long cnt2 = 0;
		
		int i = 0;
		
		if (nums[i] == 0) {
			cnt2 += 1;
			nums[i] = -1;
		}
		
		long sum = nums[i];
		
		boolean positive = sum > 0;
		positive = !positive;
		
		i ++;		
		for (;i < N; i ++) {
			
			sum += nums[i];
			
			if (positive) {
				positive = !positive;
				
				if (sum > 0) {
					continue;
				} else {
					cnt2 += 1 - sum;
					sum = 1;
				}
			} else {
				positive = !positive;
				
				if (sum < 0) {
					continue;
				} else {
					cnt2 += 1 + sum;
					sum = -1;
				}
			}
			
		}
		
		cnt = Math.min(cnt, cnt2);
	}
	void solve1() {
		
		
		int i = 0;
		
		if (nums[i] == 0) {
			cnt += 1;
			nums[i] = 1;
		}
		
		long sum = nums[i];
		
		boolean positive = sum > 0;
		positive = !positive;
		
		i ++;		
		for (;i < N; i ++) {
			
			sum += nums[i];
			
			if (positive) {
				positive = !positive;
				
				if (sum > 0) {
					continue;
				} else {
					cnt += 1 - sum;
					sum = 1;
				}
			} else {
				positive = !positive;
				
				if (sum < 0) {
					continue;
				} else {
					cnt += 1 + sum;
					sum = -1;
				}
			}
			
		}
	}	
	
	void solve3() {
		
		long cnt2 = 0;
		
		int i = 0;
		
		cnt2 += Math.abs(nums[0] + 1);
		
		nums[0] = -1;
		
		long sum = nums[i];
		
		boolean positive = sum > 0;
		positive = !positive;
		
		i ++;		
		for (;i < N; i ++) {
			
			sum += nums[i];
			
			if (positive) {
				positive = !positive;
				
				if (sum > 0) {
					continue;
				} else {
					cnt2 += 1 - sum;
					sum = 1;
				}
			} else {
				positive = !positive;
				
				if (sum < 0) {
					continue;
				} else {
					cnt2 += 1 + sum;
					sum = -1;
				}
			}
			
		}
		
		cnt = Math.min(cnt, cnt2);
	}
	
	void solve4() {
		
		long cnt2 = 0;
		
		int i = 0;
		
		cnt2 += Math.abs(nums[0] - 1);
		
		nums[0] = 1;
		
		long sum = nums[i];
		
		boolean positive = sum > 0;
		positive = !positive;
		
		i ++;		
		for (;i < N; i ++) {
			
			sum += nums[i];
			
			if (positive) {
				positive = !positive;
				
				if (sum > 0) {
					continue;
				} else {
					cnt2 += 1 - sum;
					sum = 1;
				}
			} else {
				positive = !positive;
				
				if (sum < 0) {
					continue;
				} else {
					cnt2 += 1 + sum;
					sum = -1;
				}
			}
			
		}
		
		cnt = Math.min(cnt, cnt2);
	}
}

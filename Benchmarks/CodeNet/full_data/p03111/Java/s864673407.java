import java.util.*;

class Main{
	static int num;
	static int[] goals = new int[3];
	static int[] lens;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		lens = new int[num];
		for(int i = 0; i < 3; i++) goals[i] = sc.nextInt();
		for(int i = 0; i < num; i++) lens[i] = sc.nextInt();
		sc.close();
		int result = dfs(0, 0, 0, 0);
		System.out.println(result);
	}

	static int dfs(int index, int a, int b, int c) {
		int ans[] = new int[4];
		if(index == num) {
			if(Math.min(a,Math.min(b,c)) <= 0) {
				return 1000000000;
			}
			return Math.abs(goals[0] - a) + Math.abs(goals[1] - b) + Math.abs(goals[2] - c) - 30;
		}
		ans[0] = dfs(index+1, a, b, c);
		ans[1] = dfs(index+1, a+lens[index], b, c)+10;
		ans[2] = dfs(index+1, a, b+lens[index], c)+10;
		ans[3] = dfs(index+1, a, b, c+lens[index])+10;

		return Calc.min(ans);
	}

}

class Calc {
	static int min(int[] nums) {
		int ans = nums[0];
		int len = nums.length;
		for(int i = 1; i < len; i++) {
			ans = Math.min(ans, nums[i]);
		}
		return ans;
	}
}

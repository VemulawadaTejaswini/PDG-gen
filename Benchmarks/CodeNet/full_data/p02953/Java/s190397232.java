import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String ans = "Yes";
		int prev = 0;
		boolean down = false;
		int[] nums = new int[num];
		for(int i = 0; i < num; i++){
			nums[i] = sc.nextInt();
			if(prev > nums[i])nums[i-1]--;
			prev = nums[i];
		}
		prev = 0;
		for(int i = 0; i < num; i++){
			if(prev > nums[i]){
				ans = "No";
				break;
			}
			prev = nums[i];
		}
		System.out.println(ans);
	}
}



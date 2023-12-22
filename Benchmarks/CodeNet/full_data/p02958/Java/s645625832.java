import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String ans;
		int[] nums = new int[num];
		int cnt = 0, prev = 1;
		int[] downIndex = new int[num];
		for(int i = 0; i < num; i++){
			nums[i] = sc.nextInt();
			if(nums[i] < prev){
				downIndex[cnt] = i;
				cnt++;
			}
			prev = nums[i];
		}

		switch(cnt){
			case 0:
			ans = "YES";
			break;

			case 1:
			int index = downIndex[0];
			ans = (nums[index-2] < nums[index] && nums[index-1] < nums[index+1]) ? "YES" : "NO";
			break;

			case 2:
			int index1 = downIndex[0];
			int index2 = downIndex[1];
			ans = (nums[index2-1] < nums[index1-1] && nums[index2] < nums[index1]) ? "YES" : "NO";
			break;

			default:
			ans = "NO";
		}
		System.out.println(ans);

	}
}

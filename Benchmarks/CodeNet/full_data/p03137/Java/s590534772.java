import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pieceNum = sc.nextInt();
		int goalNum = sc.nextInt();
		int[] nums = new int[goalNum];
        for(int i = 0; i < goalNum; i++)nums[i] = sc.nextInt();
        Arrays.sort(nums);
        int[] diffs = new int[goalNum-1];
        for(int i = 0; i < goalNum-1; i++)diffs[i] = Math.abs(nums[i+1]-nums[i]);

        int ans = 0;
        for(int i = 0; i < goalNum - pieceNum; i++){
            Arrays.sort(diffs);
            int min = diffs[0];

            ans += min;
            diffs[0] = diffs[goalNum-2];
        }

		System.out.println(ans);
	}
}
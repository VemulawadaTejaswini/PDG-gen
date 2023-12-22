import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		boolean[] used = new boolean[n];
		int res = Integer.MAX_VALUE;
		dfs(lists, list, k, nums, used);
		
		for(int i=0; i<lists.size(); i++) {
			List<Integer> tmpList = lists.get(i);
			int tmpvalue = 0;
			for(int j=0; j<tmpList.size(); j++) {
				tmpvalue = Collections.max(tmpList) -Collections.min(tmpList);
			}
			res = Math.min(tmpvalue, res);
		}
		System.out.println(res);
		
	}

	private static void dfs(List<List<Integer>> lists, List<Integer> list, 
			int k, int[] nums, boolean[] used) {
		if(k<0) {
			return;
		}else if(k==0) {
			lists.add(new ArrayList<Integer>(list));
		}else {
			for(int i=0; i<nums.length; i++) {
				if(used[i] || (i>0 && used[i-1]==false && nums[i]==nums[i-1])) {
					continue;
				}
				used[i] = true;
				list.add(nums[i]);
				dfs(lists, list, k-1, nums, used);
				list.remove(list.size()-1);
				used[i] = false;
			}
		}
	}
}

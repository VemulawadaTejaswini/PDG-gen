import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] nums = new int[2*n];
		
		for(int i=0; i<2*n; i++) {
			nums[i] = sc.nextInt();
		}
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		allSort(lists, nums, 0, nums.length-1);
		int max = Integer.MIN_VALUE;
		for(int i=0; i<2*n; i++) {
			for(int j=0; j<2*n; j++) {
				max = Math.max(((nums[i]+nums[j]) % m), max);
			}
		}
		List<Integer> kinu = new ArrayList<Integer>();
		for(int i=0; i<lists.size(); i++) {
			List<Integer> tmp = lists.get(i);
			for(int j=0; j+1<tmp.size(); j++) {
				if((tmp.get(j)+tmp.get(j+1))%m == max) {
					kinu.add(i);
				}
			}
		}
		for(int i=0; i<kinu.size(); i++) {
			lists.remove(kinu.get(i));
		}
		int min = Integer.MAX_VALUE;
		for(int i=0; i<lists.size(); i++) {
			List<Integer> tmp = lists.get(i);
			for(int j=0; j+1<tmp.size(); j++) {
				min = Math.min(min, (tmp.get(j)+tmp.get(j+1))%m);
			}
		}
		System.out.println(min);
		
	}

	private static void allSort(List<List<Integer>> lists, int[] nums, int begin, int end) {
		if(begin==end){
			List<Integer> list = new ArrayList<Integer>();
			for(int i : nums) {
				list.add(i);
			}
			if(!lists.contains(list)) {
				lists.add(list);
			}
			return;
	    }
		for(int i=begin; i<=end; i++) {
			swap(nums, begin, i);
			allSort(lists, nums, begin+1, end);
			swap(nums, begin, i);
		}
	}

	private static void swap(int[] nums, int begin, int i) {
		
		int tmp = nums[begin];
		nums[begin] = nums[i];
		nums[i] = tmp;
	}
}

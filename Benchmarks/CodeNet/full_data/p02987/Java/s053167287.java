

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		char[] arr=str.toCharArray();
		int[] nums=new int[4];
		for(int i=0;i<nums.length;i++) {
			nums[i]=(int)arr[i];
		}
		Arrays.sort(nums);
		if(nums[0]!=nums[3] && nums[0]==nums[1] && nums[2]==nums[3]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}

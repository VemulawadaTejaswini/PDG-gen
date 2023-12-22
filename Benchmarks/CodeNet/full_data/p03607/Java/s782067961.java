import java.util.Scanner;
import java.util.LinkedList;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		// input
		final int NUM = scan.nextInt();
		int[] nums = new int[1000000001];
		int count = 0;
		for(int i = 0; i < NUM; i++){
			int temp = scan.nextInt();
			if(nums[temp] == 0){
				nums[temp] = 1;
				count++;
			} else {
				nums[temp] = -1;
				count--;
			}
		}		
		
		// answer
		System.out.println(count);
	}
}
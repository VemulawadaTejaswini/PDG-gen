import java.util.Scanner;
import java.util.LinkedList;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> nums = new LinkedList<>();
		
		// input
		final int NUM = scan.nextInt();
		nums.add(scan.nextInt());
		for(int i = 1; i < NUM; i++){
			int temp = scan.nextInt();
			if(nums.contains(temp)){
				nums.removeFirstOccurrence(temp);
			} else {
				nums.add(temp);
			}
		}
		
		// answer
		System.out.println(nums.size());
	}
}
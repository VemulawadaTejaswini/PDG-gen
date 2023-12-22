import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Long> nums = new LinkedList<>();

		// input
		int num = scan.nextInt();
		long k = scan.nextLong();
		for(int i = 0; i < num; i++){
			nums.add(scan.nextLong());
		}

		// sort
		Collections.sort(nums);

		// check
		long max = 0;
		long sum = 0;
		fin: for(long i  = 0; i <= k; i++){
			sum = 0;
			for(int j = 0; j < num; j++){
				sum += i ^ nums.peek();
				nums.add(nums.poll());
			}
			if(sum > max){
				max = sum;
			}
		}

		// output
		System.out.println(max);

	}
}

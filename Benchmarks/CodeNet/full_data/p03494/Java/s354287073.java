import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		int[] nums = new int[n];
		boolean end = false;
		
		for(int i=0; i<n ;i++) {
			nums[i] = sc.nextInt();
		}
		
		while(true) {
			for(int i=0; i<n ;i++) {
				if(nums[i] % 2 == 0) {
					nums[i] = nums[i] / 2;
				}else {
					end = true;
					break;
				}
			}
			if(end) {
				break;
			}
			
			count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}

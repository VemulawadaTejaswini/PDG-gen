import java.util.*;
public class Main {
	public static void main(String[]aaa) {

		
		Scanner sc = new Scanner(System.in);
		 
		int cnt = sc.nextInt();
		
		int[] nums = new int[cnt];
		
		for (int i = 0 ; i < cnt; i++) {
			
			int num = sc.nextInt();
			
			nums[i] = num;  
			
		}
		// even judge method
		boolean repeatFlg = true;
		int result = 0;
		while (repeatFlg) {
			result++;
			for (int i = 0 ; i < cnt; i++) {
				
				int num = nums[i];
				
				if (num % 2 == 0) {
					
					nums [i] = num / 2;
				} else {
					repeatFlg = false;
					result--;
					break;
				}
			}
		}
			

	}

}
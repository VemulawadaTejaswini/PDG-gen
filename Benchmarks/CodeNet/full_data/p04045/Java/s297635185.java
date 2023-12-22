import java.util.*;


public class Main {
	
	
	static int n, k ;
	static boolean[] can = new boolean[10];
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		
		n = cin.nextInt();
		k = cin.nextInt();
		
		Arrays.fill(can, true);
		for (int i = 0; i < k; i ++) {
			can[cin.nextInt()] = false;
		}
		
		
		String num = String.valueOf(n);
		
		int[] nums = new int[num.length() + 1];
		nums[0] = 0;
		
		for (int i = 0; i < num.length(); i ++) {
			nums[i + 1] = num.charAt(i) - '0';
		}
		
		int index = 1;
		for (; index < nums.length; ) {
			
			int a = nums[index];
			
			if (can[a]) { 
				index ++;
				continue;
			}
			// else
			int b = increment(a);
			
			if (b > a) {
				nums[index] = b;
				index ++;
				break;
			}
			
			// else b < a
						
			if (index == 1) {
				int c = increment(0);
				nums[index-1] = c;
				index ++;
				break;
			}
			else {
				
				while (index > 0) {
					index --;
					int e = increment(nums[index]);
					if (e > nums[index]) {
						nums[index] = e;
						index ++;
						break;
					} 							
				}
				break;
			}
						
		}
		
		int d = increment(-1);
		while (index < nums.length) {
			nums[index] = d;
			index ++;
		}
		
		/*finish*/
		for (int i = 0; i < nums.length; i ++) {
			if (i == 0 && nums[0] == 0) {
				continue;
			}
			System.out.print(nums[i]);
		}		
		System.out.println();
	}
	
	public static int increment(int j) {
		
		int i = j + 1;
		
		for (; i < 20; i ++) {
			if (can[i % 10]) {
				break;
			}
		}
		
		return i % 10;
	}
	
}


import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
        	nums[i] = sc.nextInt();
        }
        
        for(int i = 0; i < nums.length - 1; i++) {
        	if(nums[i] > nums[i + 1]) {
        		cnt++;
        	}
        }
        
        if(cnt >= 2) {
        	System.out.println("No");
        } else {
        	System.out.println("Yes");
        }
        
        sc.close();
    }
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] nums = new int[N];
		int countA = 0;
		int countB = 0;
		int countC = 0;
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
			if(nums[i] <= A) {
				countA++;
			}else if(nums[i]>A && nums[i]<=B) {
				countB++;
			}else if(nums[i] > B) {
				countC++;
			}
		}
		int min = Math.min(countA, countB);
		min = Math.min(countC, min);
		System.out.println(min);
	}
}

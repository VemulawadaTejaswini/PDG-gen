import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] stickArr = new int[n];
		for(int i = 0; i < n; i++) {
			stickArr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(stickArr);
		int ans = 0;
		for(int i = stickArr.length - 1; i >= stickArr.length - k; i--) {
			ans += stickArr[i];
		}
		System.out.println(ans);
	}
}
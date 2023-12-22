import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		// 入力
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] aList = new int[n];
		for (int i = 0; i < n; i++) {
			aList[i] = scanner.nextInt();
		}
		
		// 計算
		Arrays.sort(aList);
		
		int max = aList[n-1];
		int mid = max/2;
		int target = -1;
		for (int i = 0; i < aList.length; i++) {
			if (mid <= aList[i]) {
				int targetA = aList[i-1];
				int targetB = aList[i];
				if (targetA >= max - targetB) {
					target = targetA;
				} else {
					target = targetB;
				}
				break;
			}
			
		}
		
		System.out.printf("%d %d\n", max, target);
		
	}
}
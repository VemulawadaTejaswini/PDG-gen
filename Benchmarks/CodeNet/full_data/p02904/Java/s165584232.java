import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] firstLineArr = sc.nextLine().split(" ");
		String[] secondLineArr = sc.nextLine().split(" ");
		sc.close();
		int n = Integer.parseInt(firstLineArr[0]);
		int k = Integer.parseInt(firstLineArr[1]);
		int[] sequenceArr = new int[n];
		
		for(int i = 0; i < n ;i++) {
			sequenceArr[i] = Integer.parseInt(secondLineArr[i]);
		}
		
		boolean beforeSmallestEqualLeft = false;
		int beforeLargest = n+1;
		int sequenceValiation = 1;
		
		for(int i = 0; i < n - k;i++) {
			
			int[] nowArr = Arrays.copyOfRange(sequenceArr, i, i+k);
			
			if(beforeSmallestEqualLeft && nowArr[k-1] > beforeLargest) {
				int minValue = getMinimamValue(nowArr);
				if(minValue == nowArr[0]) {
					beforeSmallestEqualLeft = true;
				}else {
					beforeSmallestEqualLeft = false;
				}
				beforeLargest = nowArr[k-1];
				continue;
			}
			
			if(isSorted(nowArr)) {
				beforeSmallestEqualLeft = true;
				beforeLargest = nowArr[k-1];
				continue;
			}
			
			sequenceValiation++;
			int minValue = getMinimamValue(nowArr);
			if(nowArr[k-1] > beforeLargest) {
				beforeLargest = nowArr[k-1];
			}else {
				beforeLargest = getMaxmamValue(nowArr);
			}
			if(minValue == nowArr[0]) {
				beforeSmallestEqualLeft = true;
			}else {
				beforeSmallestEqualLeft = false;
			}	
		}
		System.out.println(sequenceValiation);
	}
	
	public static boolean isSorted(int[] intArr) {
		
		for(int i = 0; i < intArr.length - 1;i++) {
			if(intArr[i] > intArr[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int getMinimamValue(int[] intArr) {
		int minimamValue = intArr[0];
		for(int i = 1; i < intArr.length;i++) {
			if(minimamValue > intArr[i]) {
				minimamValue = intArr[i];
			}
		}
		return minimamValue;
	}
	
	public static int getMaxmamValue(int[] intArr) {
		int maxmamValue = intArr[0];
		for(int i = 1; i < intArr.length;i++) {
			if(maxmamValue < intArr[i]) {
				maxmamValue = intArr[i];
			}
		}
		return maxmamValue;
	}
}

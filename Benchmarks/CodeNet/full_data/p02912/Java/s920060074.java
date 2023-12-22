import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nmArr = sc.nextLine().split(" ");
		String[] priceStrArr = sc.nextLine().split(" ");
		sc.close();
		
		int n = Integer.parseInt(nmArr[0]);
		int m = Integer.parseInt(nmArr[1]);
		int[] priceArrReverse = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			priceArrReverse[i] = Integer.parseInt(priceStrArr[i]);
		}
		
		Arrays.sort(priceArrReverse);
		int[] priceArr = new int[n];
		for(int i = 0; i < n; i++) {
			priceArr[i] = priceArrReverse[n - 1 - i];
		}
		
		int nextIndex = 1;
		int maxPriceIndex = 0;
		for(int i = 0 ; i < m; i++) {
			priceArr[maxPriceIndex] = priceArr[maxPriceIndex] / 2;
			maxPriceIndex = getMaxIndex(priceArr, 0, nextIndex - 1);
			if(nextIndex < n && priceArr[nextIndex] > priceArr[maxPriceIndex]) {
				maxPriceIndex = nextIndex;
				nextIndex++;
			}
		}
		
		int sumprice = 0;
		
		for(int i = 0; i < n; i++) {
			sumprice = sumprice + priceArr[i];
		}
		System.out.println(sumprice);
		
	}
	
	public static int getMaxIndex(int[] intArr,int start, int end) {
		int maxPriceIndex = start;
		for(int i = start; i <= end; i++) {
			if(intArr[maxPriceIndex] < intArr[i]) {
				maxPriceIndex = i;
			}
		}
		return maxPriceIndex;
	}

}

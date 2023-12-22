import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	private static Scanner sc;
	
	public static void main (String args[]) {
		sc = new Scanner(System.in);
		//購入する品物数
		int nNum = sc.nextInt();
		//割引券の所持数
		int mNum = sc.nextInt();
		//品物の価格
		Integer[] priceArray = new Integer[nNum];
		for (int i = 0; i<nNum; i++) {
			priceArray[i] = sc.nextInt();
		}
		
		//降順ソート　高い順
		Arrays.sort(priceArray, Comparator.reverseOrder());
		for(int i = 0; i<mNum; i++) {
			int topPrice = priceArray[0];
			priceArray[0] = topPrice/2;
			Arrays.sort(priceArray, Comparator.reverseOrder());
		}
		long sum = 0;
		for (int price : priceArray) {
			sum+=price;
		}
		System.out.println(sum);
	}
}

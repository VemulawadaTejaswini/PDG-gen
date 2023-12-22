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
		int[] priceArray = new int[nNum];
		for (int i = 0; i<nNum; i++) {
			priceArray[i] = sc.nextInt();
		}
		//降順ソート　高い順
		for(int i = 0; i<mNum; i++) {
			int max = 0;
			int maxIndex = 0;
			for(int k=0; k<priceArray.length; k++) {
				if (max<priceArray[k]) {
					max = priceArray[k];
					maxIndex = k;
				}
			}
			priceArray[maxIndex] = priceArray[maxIndex]/2;
		}
		long sum = 0;
		for (int price : priceArray) {
			sum+=price;
		}
		System.out.println(sum);
	}
	
//	private static int getMaxIndex(int[] priceArray) {
//		int max = 0;
//		int maxIndex = 0;
//		for(int i=0; i<priceArray.length; i++) {
//			if (max<priceArray[i]) {
//				max = priceArray[i];
//				maxIndex = i;
//			}
//		}
//		return maxIndex;
//	}
}
		
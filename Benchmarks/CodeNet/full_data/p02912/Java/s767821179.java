import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
		List<Integer> priceList = new LinkedList<>();
		for (int i = 0; i<nNum; i++) {
			priceList.add(sc.nextInt());
		}
		//降順ソート　高い順
		Collections.sort(priceList, Comparator.reverseOrder());
		for(int i = 0; i<mNum; i++) {
			int topPrice = priceList.get(0);
			priceList.set(0, topPrice/2);
			Collections.sort(priceList, Comparator.reverseOrder());
		}
		long result = priceList.stream().reduce(0, (a, b) -> a + b);
		System.out.println(result);
	}
}
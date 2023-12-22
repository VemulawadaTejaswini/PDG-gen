import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EnergyDrinkCollector {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] b = new int[n];
		int[] a = new int[n];

		//long tmp = 0;
		int count = 0;
		long money = 0;

		Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			map.put(sc.nextInt(),sc.nextInt());
		}


//		for (int i = 0; i < a.length -1; i++) {
//			for (int j = a.length - 1; j > i ; j--) {
//				if (a[j] < a[j-1]) {
//					tmp = a[j-1];
//					a[j-1] = a[j];
//					a[j] = tmp;
//
//					tmp = b[j-1];
//					b[j-1] = b[j];
//					b[j] = tmp;
//				}
//			}
//		}

		for (Map.Entry<Integer, Integer> me : map.entrySet()) {
			//System.out.println(a[i]);
			count += me.getValue();
			if (count < m) {
				money += me.getKey() * me.getValue();

			} else if (count == m) {
				money += me.getKey() * me.getValue();
				break;

			} else {
				money +=  me.getKey() * (m - (count - me.getValue())) ;
				break;
			}

		}

		System.out.println(money);

	}

}



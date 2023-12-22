import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<int[]> dishList = new ArrayList<int[]>();

		long point = 0;

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			dishList.add(new int[] {a,b});
		}

		Collections.sort(dishList, new Comparator<int[]>() {
			public int compare(int[] obj1, int[] obj2) {
					long val1 = obj1[0] + obj1[1];
					long val2 = obj2[0] + obj2[1];
					return (Long.valueOf(val1)).compareTo(val2);
			}
		});

		for(int i = 0; i < n; i++) {
			if(i%2 == 0) {
				// 偶数は高橋ターン(Aを+)
				point += dishList.get(i)[0];
			} else {
				// 奇数は青木ターン(Bを-)
				point -= dishList.get(i)[1];
			}
		}

		System.out.println(point);


	}

}

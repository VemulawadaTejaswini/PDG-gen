import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		List list = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (m % i == 0)
				list.add(Integer.valueOf(i));
		}

		Collections.reverse(list);
		//System.out.println(list.toString());

		int size = list.size();
		for (int i = 0; i < size; i++) {
			Integer Int = (Integer) list.get(i);
			//System.out.println(Int.intValue()*(long) n);
			if (Int.intValue()*(long) n <= m) {
				System.out.println(Int);
				return;
			}
		}

	}

}

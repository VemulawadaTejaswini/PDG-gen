import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);

		int ans =0;

		int ope1 = list.get(2) - list.get(1);

		ans += ope1;

		list.set(1, list.get(2));
		list.set(0, list.get(0) + ope1);

		int ope2 = list.get(2) - list.get(0);

		if(ope2%2 == 0) {
			ans += ope2/2;
		} else {
			ans += ope2/2 + 2;
		}
		System.out.println(ans);
	}
}

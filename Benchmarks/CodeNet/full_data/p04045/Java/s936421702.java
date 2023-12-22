import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> hate = new ArrayList<Integer>();
		for (int i = 0; i < k; i++) {
			hate.add(sc.nextInt());
		}
		boolean flg = false;
		int out = price;
		while (!flg) {
			out++;
			List<Integer> list = new ArrayList<Integer>();
			list = getKeta(out);
			int like = 0;
			for (int i = 0; i < list.size(); i++) {
				if (!hate.contains(list.get(i))) {
					like++;
				}
			}
			if (like == list.size()) {
				flg = true;
			}
		}

		System.out.println(out);
	}

	public static List<Integer> getKeta(int n) {
		List<Integer> list = new ArrayList<>();
		while (n > 0) {
			list.add(n % 10);
			n /= 10;
		}
		return list;
	}
}
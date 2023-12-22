import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {

			int n = Integer.parseInt(sc.nextLine());
			String a = sc.nextLine();
			String[] b = a.split(" ");
			List<Integer> list = new ArrayList<>();
			List<Integer> max = new ArrayList<>();

			for (int i = 0; i < b.length; i++) {
				list.add(Integer.parseInt(b[i]));
				max.add(Integer.parseInt(b[i]));
			}

			Collections.sort(max);
			int judge = max.get(max.size() - 1);
			int all1 = 0;
			int num = 1;
			if (judge < n) {
				for (int i = -(n / 2); i < n - (n / 2); i++, num++) {
					all1 += Math.abs(list.get(num - 1) - (-(n / 2) + num));
				}
			} else {

				for (int i = 0; i < n; i++) {
					all1 += Math.abs(list.get(i) - (i + 1));
				}
			}

			System.out.println(all1);
		}
	}
}
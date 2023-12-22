package AtCorder.AtCorder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String input = "5\n" +
				"100 1 2 3 14 15 58 58 58 29";
		String[] str = input.split("\n");
		int first = Integer.parseInt(str[0]);
		int result = 0;

		String[] arr = str[1].split(" ");
		List<String> second = new ArrayList<String>();
		second.addAll(Arrays.asList(arr));

		for (int i = 0; i < first; i++) {
			int a = Integer.parseInt(second.get(0));
			int data = 5000000;
			int num = 1;

			for (int j = 1; j < second.size(); j++) {
				if (data > Integer.parseInt(second.get(j)) - a && Integer.parseInt(second.get(j))-a >= 0) {
					data = Integer.parseInt(second.get(j)) - a;
					num = j;
				} else if (data > a - Integer.parseInt(second.get(j)) && a - Integer.parseInt(second.get(j)) >= 0) {
					data = a - Integer.parseInt(second.get(j));
					num = j;
				}
			}
			if (a < Integer.parseInt(second.get(num))) {
				result = result + a;
			} else {
				result = result + Integer.parseInt(second.get(num));
			}

			second.remove(num);
			second.remove(0);

		}
		System.out.println(result);
	}
}

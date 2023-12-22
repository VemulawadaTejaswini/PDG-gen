import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		int first = Integer.parseInt(br.readLine());
		int result = 0;

		String[] arr;
			arr = br.readLine().split(" ");
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
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

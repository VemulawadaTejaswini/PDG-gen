import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		int n = Integer.parseInt(cin.nextLine());
		String[] array = cin.nextLine().split(" ");

		List<Long> bArray = new ArrayList<Long>(array.length);

		for (int i = 0; i < n; i++) {
			bArray.add(Long.parseLong(array[i]));
			Collections.reverse(bArray);
		}

		StringBuilder buf = new StringBuilder(bArray.size());
		for (long num : bArray) {
			buf.append(num);
			buf.append(" ");
		}
		System.out.println(buf.toString().trim());

		cin.close();
	}
}
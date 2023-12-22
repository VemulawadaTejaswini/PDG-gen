import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		if (n != 0) {
			List<Integer> result = conv(n);
			for (Integer elem : result) {
				System.out.print(elem);
			}
			System.out.println("");
		} else {
			System.out.println("0");
		}
		in.close();
	}

	public static List<Integer> conv(int i) {
		List<Integer> result = new ArrayList<>();
		while (i != 0) {
			if (i % -2 == 0) {
				result.add(0);
			} else {
				result.add(1);
				i = i - 1;
			}
			i = i / -2;
		}
		Collections.reverse(result);
		return result;
	}
}
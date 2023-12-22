import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc1 = new Scanner(System.in);
		int d = Integer.parseInt(sc1.next());
		int n = Integer.parseInt(sc1.next());
		System.out.println(div(d, n));
		sc1.close();
	}

	public static int div(int d, int n) {
		List<Integer> list = new ArrayList<>();
		int num = n;
		for (int j = 0; j < n; j++) {
			if (d == 0) {
				list.add(j + 1);
			}
			if (d == 1) {
				list.add((j + 1) * 100);
			}
			if (d == 2) {
				list.add((j + 1) * 10000);
			}
		}
		num = list.get(n - 1);
		return num;
	}
}
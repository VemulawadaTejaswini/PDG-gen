
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int N = in.nextInt();
		List<Long[]> list = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			long A = in.nextLong();
			long B = in.nextLong();
			list.add(new Long[] {B - A, A, B});
		}
		list.sort((a, b)->{
			if (a[0] > b[0] || a[0] == b[0] && a[1] > b[1] ||
					a[0] == b[0] && a[1] == b[1] && a[2] > b[2]) {
				return -1;
			}
			if (a[0] == b[0] && a[1] == b[1] && a[2] == b[2]) {
				return 0;
			}
			return 1;
		});

		boolean f = true;
		long happy = 0;
		for (Long[] longs : list) {
			happy += f ? longs[1] : -(longs[2]);
			f = !f;
		}
		System.out.println(happy);
	}
}

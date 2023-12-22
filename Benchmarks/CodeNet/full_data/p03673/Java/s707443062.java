import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Long> a = new ArrayList<>();
		List<Long> b = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				a.add(in.nextLong());
			} else {
				b.add(in.nextLong());
			}
		}
		if (n % 2 == 0) {
			Collections.reverse(b);
			for (int i = 0; i < b.size(); i++) {
				System.out.println(b.get(i));
			}
			for (int i = 0; i < a.size(); i++) {
				System.out.println(a.get(i));
			}
		} else {
			Collections.reverse(a);
			for (int i = 0; i < a.size(); i++) {
				System.out.println(a.get(i));
			}
			for (int i = 0; i < b.size(); i++) {
				System.out.println(b.get(i));
			}
		}
		in.close();
	}
}
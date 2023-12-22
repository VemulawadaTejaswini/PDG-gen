import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> s = new ArrayList<>();
		s.add(sc.next());
		int q = sc.nextInt();
		int reverse = 0;

		for(int i = 0; i < q; i++) {
			if(sc.nextInt() == 1) {
				reverse = 1 - reverse;
			}else {
				if(sc.nextInt() - 1 == reverse) {
					s.add(0, sc.next());
				}else {
					s.add(sc.next());
				}
			}
		}
		if(reverse == 1) {
			Collections.reverse(s);
			for(String value : s) {
				System.out.print(value);
			}
		}
		else {
			for(String value : s) {
				System.out.print(value);
			}
		}
		sc.close();
	}
}

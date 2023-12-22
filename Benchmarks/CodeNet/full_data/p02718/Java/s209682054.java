
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		List<Integer> s = new ArrayList();
		int total = 0;
		for(int i =0; i <N ; i++) {
			int a =Integer.parseInt(sc.next());
			total += a;
			s.add(a);
		}
		Collections.sort(s);
		Collections.reverse(s);


		for(int m = 0; m < M; m++) {
			int a = s.get(m);
			if(a*4*M < total) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");

	}
}
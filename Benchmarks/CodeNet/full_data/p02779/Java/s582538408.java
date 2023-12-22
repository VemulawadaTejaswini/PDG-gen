import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		List<Long> list = new ArrayList();
		for(int i=0; i<N ; i++) {
			list.add(Long.parseLong(sc.next()));
		}
		Collections.sort(list);
		long b = Long.MAX_VALUE;
		for(Long a : list) {
			if(a == b) {
				System.out.println("NO");
				return;
			}
			b = a;
		}
		System.out.println("YES");
	}
}

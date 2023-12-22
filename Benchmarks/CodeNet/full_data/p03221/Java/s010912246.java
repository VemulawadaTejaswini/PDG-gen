package agc044_a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner scan = new Scanner(System.in);
		int N = Integer.valueOf(scan.next());
		int M = Integer.valueOf(scan.next());
		ArrayList<Si> list = new ArrayList<>();
		int seq = 0;
		for (int i = 0; i < M; i++) {
			Si si = new Si();
			si.num = seq++;
			si.p = Integer.valueOf(scan.next());
			si.y = Integer.valueOf(scan.next());
			list.add(si);
		}

		list.sort(Comparator.comparing(Si::getP).thenComparing(Si::getY));

		int now = list.get(0).p;
		int count = 1;
		for(Si x:list) {
			if(now != x.p) {
				now = x.p;
				count = 1;
			}
			x.str = String.format("%06d", x.p) + String.format("%06d", count++);
		}

		list.stream().sorted((x, y) -> x.num - y.num).map(x -> x.str).forEach(System.out::println);
	}

	class Si {
		int num;
		int p;
		int y;
		String str;

		public int getP() {
			return p;
		}


		public int getY() {
			return y;
		}
	}
}

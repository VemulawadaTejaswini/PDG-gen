import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Points2> a = new ArrayList<Points2>();
		for (int i = 0; i < n; i++) {
			Points2 p = new Points2(sc.nextInt(), sc.nextInt());
			a.add(p);
		}
		Collections.sort(a, Comparator.reverseOrder());

		ArrayList<Points> b = new ArrayList<Points>();
		for (int i = 0; i < n; i++) {
			Points p = new Points(sc.nextInt(), sc.nextInt());
			b.add(p);
		}
		Collections.sort(b);

		int cnt = 0;
		int m = n;
		for(int i = 0; i < n; i++) {
			Points p1 = b.get(i);
			for(int j = 0; j < m; j++) {
				Points2 p2 = a.get(j);
				if(p1.x - p2.x > 0 && p1.y - p2.y > 0) {
					cnt++;
					a.remove(j);
					m--;
					break;
				}
			}
		}

		System.out.println(cnt);
	}
}

class Points implements Comparable<Points>{
	public int x;
	public int y;

	public Points(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Points arg0) {
		if(this.x != arg0.x) {
			return this.x - arg0.x;
		} else if (this.x == arg0.x && this.y != arg0.y) {
			return this.y - arg0.y;
		} else {
			return 0;
		}
	}
}

class Points2 implements Comparable<Points2>{
	public int x;
	public int y;

	public Points2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Points2 arg0) {
		if(this.y != arg0.y) {
			return this.y - arg0.y;
		} else if (this.y == arg0.y && this.x != arg0.x) {
			return this.x - arg0.x;
		} else {
			return 0;
		}
	}
}
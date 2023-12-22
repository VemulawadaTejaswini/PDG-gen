import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<rank> l = new ArrayList<>(n);
		for (int i = 1; i <= n; i++) {
			l.add(new rank(i, sc.next(), sc.nextInt()));
		}
		Collections.sort(l);
		for (int i = 0; i < n; i++) {
			System.out.println(l.get(i));
		}
	}
}

class rank implements Comparable<rank> {
	int num;
	String city;
	int point;

	rank(int n, String s, int p) {
		num = n;
		city = s;
		point = p;
	}

	@Override
	public int compareTo(rank o) {
		if (city.compareTo(o.city) != 0) {
			return city.compareTo(o.city);
		}
		return o.point - point;
	}

	public String toString() {
		return String.valueOf(num);
	}
}

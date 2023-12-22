import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Pair> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new Pair(i + 1, sc.next(), sc.nextInt()));
		}
		Collections.sort(list, new MyComparator());
		for (int i = 0; i < n; i++) {
			System.out.println(list.get(i).index);
		}
	}
}
class Pair {
	public int index;
	public String s;
	public int p;
	public Pair(int index, String s, int p) {
		this.index = index;
		this.s = s;
		this.p = p;
	}
}

class MyComparator implements Comparator<Pair> {
	@Override
	public int compare(Pair sort1, Pair sort2) {
		if ((sort1.s).compareTo(sort2.s) == 0) {
			return sort2.p - sort1.p;
		} else {
			return (sort1.s).compareTo(sort2.s);
		}
	}
}

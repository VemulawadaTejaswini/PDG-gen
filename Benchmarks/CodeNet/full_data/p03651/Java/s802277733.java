import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static int limit = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int wantNum = sc.nextInt();
		TreeSet<Integer> nums = new TreeSet<>();
		for(int i = 0; i < N; i++) {
			nums.add(sc.nextInt());
		}
		System.out.println(check(nums, wantNum));
	}
	public static String check(TreeSet<Integer> l, int wantNum) {
		TreeSet<Integer> lClone = new TreeSet<Integer>(l);
		Iterator<Integer> iter = lClone.iterator();
		Iterator<Integer> iter2 = lClone.iterator();

		for(;iter.hasNext();iter2 = lClone.iterator()) {
			int a = iter.next();
			for(;iter2.hasNext();) {
				l.add(Math.abs(a - iter2.next()));
			}
		}

		if(l.contains(wantNum)) {
			return "POSSIBLE";
		}

		limit += 1;
		if(limit > 2) {
			return "IMPOSSIBLE";
		} else {
			return check(l, wantNum);
		}
	}
}

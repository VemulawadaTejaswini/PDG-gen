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
		TreeSet<Integer> lCloneOld = new TreeSet<Integer>(nums);
		Iterator<Integer> iter2 = nums.iterator();
		System.out.println(check(nums, wantNum, lCloneOld));
	}
	public static String check(TreeSet<Integer> l, int wantNum, TreeSet<Integer> lCloneOld) {
		TreeSet<Integer> lClone = new TreeSet<Integer>(l);
		Iterator<Integer> iter = lClone.iterator();
		Iterator<Integer> iter2 = lCloneOld.iterator();
		for(;iter.hasNext();iter2 = lCloneOld.iterator()) {
			int a = iter.next();
			for(;iter2.hasNext();) {
				l.add(Math.abs(a - iter2.next()));
			}
		}

		limit += 1;
		if(l.contains(wantNum)) {
			return "POSSIBLE";
		} else if(limit > 2) {
			return "IMPOSSIBLE";
		} else {
			return check(l, wantNum,lCloneOld);
		}
	}
}
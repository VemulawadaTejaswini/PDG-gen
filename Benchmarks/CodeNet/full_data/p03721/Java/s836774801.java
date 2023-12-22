import java.util.TreeSet;
import java.util.Scanner;
import java.util.Iterator;

class Elem implements Comparable<Elem> {
	public int a_, n_, idx_;
	public Elem (int a, int n, int idx) {
		a_ = a;
		n_ = n;
		idx_ = idx;
	}
	public int compareTo (Elem o) {
		if (a_ != o.a_)
			return a_ - o.a_;
		return idx_ - o.idx_;
	}
}

public class Main {

	public static void main (String[] args) {
		int N;
		long K;
		Scanner sc = new Scanner (System.in);
		N = sc.nextInt ();
		K = sc.nextLong ();
		TreeSet<Elem> set = new TreeSet<Elem> ();
		for (int i=0; i<N; i++) {
			int a = sc.nextInt ();
			int b = sc.nextInt ();
			set.add (new Elem (a, b, i));
		}
		Iterator<Elem> iter = set.iterator ();
		long sum = 0;
		while (iter.hasNext ()) {
			Elem e = iter.next ();
			sum += e.n_;
			if (sum>=K) {
				System.out.println (e.a_);
				break;
			}
		}
	}
}
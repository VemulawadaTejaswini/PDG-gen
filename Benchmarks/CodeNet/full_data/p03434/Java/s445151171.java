import java.util.TreeSet;
import java.util.Scanner;
import java.util.Iterator;

class Elem implements Comparable <Elem> {
	int a_, idx_;
	Elem (int a, int idx) {
		a_ = a;
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
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		TreeSet<Elem> set = new TreeSet<Elem> ();
		for (int i=0; i<N; i++) {
			int a = sc.nextInt ();
			set.add (new Elem (a, i));
		}
		Iterator <Elem> iter = set.iterator ();
		int dif = 0, idx = 0;
		while (iter.hasNext ()) {
			Elem e = iter.next ();
			if (idx%2==0) 
				dif += e.a_;
			else
				dif -= e.a_;
			idx ++;
		}
		System.out.println (dif);
	}
}
import java.io.*;
import java.util.*;


class Work implements Comparable<Work> {
	int _a, _b, _idx;
	public Work (int a, int b, int idx) {
		_a = a; _b = b; _idx = idx;
	}

	@Override
	public int compareTo (Work w) {
		int r =  _b-w._b;
		if (r!=0)
			return r;
		r = _a-w._a;
		if (r!=0)
			return r;
		r = _idx-w._idx;
		return r;
	}
}



public class D {

	public static void main (String[] args) {
		int N;
		Scanner sc = new Scanner (System.in);
		TreeSet<Work> set = new TreeSet<Work> ();
		N = sc.nextInt ();
		for (int i=0; i<N; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			Work w = new Work (a,b,i);
			set.add (w);
		}

		Iterator<Work> iterator = set.iterator ();
		int time = 0;
		while (iterator.hasNext ()) {
			Work w = iterator.next ();
			time += w._a;
			if (time>w._b) {
				System.out.println ("No");
				return;
			}
		}
		System.out.println ("Yes");
	}
}

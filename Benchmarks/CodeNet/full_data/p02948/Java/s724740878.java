import java.util.*;

import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
//		int[] a = new int[n];
//		int[] b = new int[n];
		ArrayList<Ab> ab = new ArrayList<>(n);
		for(i=0;i<n;i++) {
//			a[i] = parseInt(sc.next());
//			b[i] = parseInt(sc.next());
			ab.add(new Ab(parseInt(sc.next()), parseInt(sc.next())));
		}
		sc.close();
		Collections.sort(ab, new Comparator<Ab>() {
			@Override
			public int compare(Ab s1, Ab s2) {
				if(s2.b != s1.b) {
					return s2.b - s1.b;
				} else {
					return s1.a - s2.a;
				}
			}
		});
		int ans=0;
		j=0;
		for(i=1;i<=m;i++) {
			for(j=0;j<ab.size();j++) {
				if(ab.get(j).a <= i) {
					ans += ab.get(j).b;
					ab.remove(j);
					break;
				}
			}
		}
		out.println(ans);
	}
}

class Ab {
	int a;
	int b;
	Ab(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

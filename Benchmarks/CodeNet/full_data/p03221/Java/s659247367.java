import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i, j, k;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		Py[] py = new Py[m];
		int[] p = new int[m];
		for(i = 0; i < m; i++) {
			p[i] = parseInt(sc.next());  
			py[i] = new Py(i, p[i],parseInt(sc.next()));
		}
		sc.close();
		Arrays.sort(py, (a, b) -> {if(a.p != b.p) {
			return a.p - b.p;
		} else {
			return a.y - b.y;
		}
		});
		int prep = -1;
		int xx = 0;
		int[] x = new int[m];
		for(i = 0; i < m; i++) {
			if(prep == py[i].p) {
				xx++;
			} else {
				prep = py[i].p;
				xx=1;
			}
			x[py[i].m] = xx;
		}
//		Arrays.sort(py, (a, b) -> a.m - b.m);
		PrintWriter out = new PrintWriter(System.out);
		for(i = 0; i < m; i++) {
			out.printf("%06d%06d%n", p[i], x[i]);
		}
		out.flush();
	}
}
class Py {
	int p;
	int y;
	int m;
	Py(int m, int p, int y){
		this.m = m;
		this.p = p;
		this.y = y;
	}
}

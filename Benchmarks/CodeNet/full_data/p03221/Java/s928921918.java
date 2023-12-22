import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		Py[] py0 = new Py[m];
		Py[] py1 = new Py[m];
		for(i = 0; i < m; i++) {
			py0[i] = new Py(parseInt(sc.next()), parseInt(sc.next()));
			py1[i] = py0[i];
		}
		sc.close();
		Arrays.sort(py1, new Comparator<Py>() {
			@Override
			public int compare(Py a, Py b) {
				if(a.p != b.p) {
					return a.p - b.p;
				} else {
					return a.y - b.y;
				}
			}
		});
		int prep = -1;
		int xx = 0;
		for(i = 0; i < m; i++) {
			if(prep == py1[i].p) {
				xx++;
			} else {
				prep = py1[i].p;
				xx=1;
			}
			py1[i].y = xx;
		}
		DecimalFormat df = new DecimalFormat("000000");
		PrintWriter pw = new PrintWriter(out);
		for(i = 0; i < m; i++) {
			pw.print(df.format(py0[i].p));
			pw.println(df.format(py0[i].y));
		}
		pw.flush();
	}
}
class Py {
	int p;
	int y;
	Py(int p, int y){
		this.p = p;
		this.y = y;
	}
}

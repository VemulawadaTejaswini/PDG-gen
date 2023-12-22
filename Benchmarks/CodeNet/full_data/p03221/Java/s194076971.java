import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i, j, k;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		Py[] py = new Py[m];
		for(i = 0; i < m; i++) {
			py[i] = new Py(i, parseInt(sc.next()),parseInt(sc.next()));
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
		for(i = 0; i < m; i++) {
			if(prep == py[i].p) {
				xx++;
			} else {
				prep = py[i].p;
				xx=1;
			}
			py[i].x = xx;
		}
		Arrays.sort(py, (a, b) -> a.m - b.m);
		for(i = 0; i < m; i++) {
			out.printf("%06d%06d%n", py[i].p, py[i].x);
		}
	}
}
class Py {
	int p;
	int y;
	int m;
	int x;
	Py(int m, int p, int y){
		this.m = m;
		this.p = p;
		this.y = y;
	}
}

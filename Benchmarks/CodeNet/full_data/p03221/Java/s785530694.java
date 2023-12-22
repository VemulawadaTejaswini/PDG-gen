import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i, j, k;
		int n, m = 0;
		Py[] py0 = null;
		Py[] py1 = null;
		String[] inn = null;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
			inn = br.readLine().split(" ");
			n = parseInt(inn[0]);
			m = parseInt(inn[1]);
			py0 = new Py[m];
			py1 = new Py[m];
			for(i = 0; i < m; i++) {
				inn = br.readLine().split(" ");
				py0[i] = new Py(parseInt(inn[0]), parseInt(inn[1]));
				py1[i] = py0[i];
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		Arrays.sort(py1, (a, b) -> {if(a.p != b.p) {
			return a.p - b.p;
		} else {
			return a.y - b.y;
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
		PrintWriter out = new PrintWriter(System.out);
		for(i = 0; i < m; i++) {
			out.printf("%06d%06d%n", py0[i].p, py0[i].y);
		}
		out.flush();
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

import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int h = parseInt(sc.next());
		int w = parseInt(sc.next());
		char[][] a = new char[h][w];
		for (i = 0; i < h; i++) {
			a[i] = sc.next().toCharArray();
		}
		sc.close();
		ArrayList<Integer> hh = new ArrayList<>();
		ArrayList<Integer> ww = new ArrayList<>();
		for (i = 0; i < h; i++) {
			for (j = 0; j < w; j++) {
				if(a[i][j] != '.') {
					hh.add(i);
					break;
				}
			}
		}
		for (i = 0; i < w; i++) {
			for (j = 0; j < h; j++) {
				if(a[j][i] != '.') {
					ww.add(i);
					break;
				}
			}
		}
//		out.println(hh.toString());
//		out.println(ww.toString());
		PrintWriter pw = new PrintWriter(out);
		for (Integer ii:hh) {
			for (Integer jj:ww) {
				pw.print(a[ii][jj]);
			}
			pw.println();
		}
		pw.flush();
	}
}

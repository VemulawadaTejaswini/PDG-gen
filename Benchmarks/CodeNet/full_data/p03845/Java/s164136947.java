import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] t = new int[n];
		int sum=0;
		for (i = 0; i < n; i++) {
			t[i] = parseInt(sc.next());1
			sum+=t[i];
		}
		int m = parseInt(sc.next());
		int[] p = new int[m];
		int[] x = new int[m];
		for (i = 0; i < m; i++) {
			p[i] = parseInt(sc.next());
			x[i] = parseInt(sc.next());
		}
		sc.close();
		PrintWriter pw = new PrintWriter(out);
		for (i = 0; i < m; i++) {
			pw.println(sum-t[p[i]-1]+x[i]);
		}
		pw.flush();;
	}
}

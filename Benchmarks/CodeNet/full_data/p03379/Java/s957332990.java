import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] x = new int[n];
		for(i=0;i<n;i++) {
			x[i] = parseInt(sc.next());
		}
		sc.close();
		int[] y = new int[n-1];
		PrintWriter pw = new PrintWriter(out);
		for(i=0;i<n;i++) {
			arraycopy(x, 0, y, 0, i);
			arraycopy(x, i+1, y, i, n-i-1);
			Arrays.sort(y);
			pw.println(y[(n-1)/2]);
		}
		pw.flush();
	}
}

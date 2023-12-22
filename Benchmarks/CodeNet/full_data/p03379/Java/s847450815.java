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
		int[] y = new int[n];
		arraycopy(x, 0, y, 0, n);
		Arrays.sort(y);
		int medlow  = y[n/2-1];
		int medhigh = y[n/2];
		PrintWriter pw = new PrintWriter(out);
		for(i=0;i<n;i++) {
			if(x[i]<=medlow) {
				pw.println(medhigh);
			} else {
				pw.println(medlow);
			}
		}
		pw.flush();
	}
}

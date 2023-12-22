import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		for(i=0;i<n;i++) {
			a[parseInt(sc.next())-1] = i+1;
		}
		sc.close();
        PrintWriter pw = new PrintWriter(out);
		for (i = 0; i < n; i++) {
				pw.print(a[i]);
				pw.print(" ");
		}
		pw.println();
		pw.flush();
	}
}

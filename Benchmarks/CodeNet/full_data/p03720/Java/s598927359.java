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
		int m = parseInt(sc.next());
		int[] c = new int[n+1];
		int a;
		int b;
		for (i = 0; i < m; i++) {
			a = parseInt(sc.next());
			b = parseInt(sc.next());
			c[a]++;
			c[b]++;
		}
		sc.close();
		PrintWriter pw = new PrintWriter(out);
		for(i=1;i<=n;i++) {
			pw.println(c[i]);
		}
		pw.flush();
	}
}

import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int AB = 26;
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[][] s = new int[n][AB];
		for (i = 0; i < n; i++) {
			char[] c = sc.next().toCharArray();
			for (j = 0; j < c.length; j++) {
				s[i][c[j]-'a']++;
			}
		}
		int[] ss = new int[AB];
		for (i = 0; i < AB; i++) {
			int mn = s[0][i];
			for (j = 1; j < n; j++) {
				mn = Math.min(mn, s[j][i]);
			}
			ss[i] = mn;
		}
		PrintWriter pw = new PrintWriter(out);
		for (i = 0; i < AB; i++) {
			if(ss[i]>0) {
				for (j = 0; j < ss[i]; j++) {
					pw.print((char)('a'+i));
				}
			}
		}
		pw.println();
		pw.flush();
	}
}

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
		char[] o = sc.next().toCharArray();
		char[] e = sc.next().toCharArray();
		sc.close();
		PrintWriter pw = new PrintWriter(out);
		for(i=0;i<e.length;i++) {
			pw.print(o[i]);
			pw.print(e[i]);
		}
		if(o.length!=e.length) {
			pw.print(o[o.length-1]);
		}
		pw.println();
		pw.flush();
	}
}

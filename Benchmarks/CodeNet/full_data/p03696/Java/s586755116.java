import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		char[] s = sc.next().toCharArray();
		sc.close();
		int l=0;
		int r=0;
		for (i = 0; i < s.length; i++) {
			if(s[i]=='(') {
				l++;
			} else if(s[i]==')') {
				if(l>0) {
					l--;
				} else {
					r++;
				}
			} 
		}
		PrintWriter pw = new PrintWriter(out);
		for (i = 0; i < r; i++) {
			pw.print('(');
		}
		pw.print(new String(s));
		for (i = 0; i < l; i++) {
			pw.print(')');
		}
		pw.println();
		pw.flush();
	}
}

import java.util.*;
//import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;
//import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();
		char[] s2 = new char[s.length*2];
		arraycopy(s, 0, s2, 0, s.length);
		arraycopy(s, 0, s2, s.length, s.length);
		boolean f = false;
		for (i = 1; i <= s.length; i++) {
			boolean f2 = true;
			for (j = 0; j < s.length; j++) {
				if(s2[i+j] != t[j]) {
					f2 = false;
					break;
				}
			}
			if(f2) {
				f = true;
				break;
			}
		}
		out.println(f?"Yes":"No");
	}
}

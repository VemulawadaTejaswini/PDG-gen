import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		sc.close();
		int cnt=0;
		char[] c = null;
		for (i = a; i <= b; i++) {
			c = String.valueOf(i).toCharArray();
			if(c[0]==c[4]&&c[1]==c[3]) {
				cnt++;
			}
		}
		out.println(cnt);
	}
}

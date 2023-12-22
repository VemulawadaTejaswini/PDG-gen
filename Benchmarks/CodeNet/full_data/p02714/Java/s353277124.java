import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		char[] s = sc.next().toCharArray();
		sc.close();
		long r=0,g=0,b=0;
		for (i = 0; i < s.length; i++) {
			switch(s[i]) {
				case 'R':
					r++;
					break;
				case 'G':
					g++;
					break;
				case 'B':
					b++;
					break;
			}
		}
		long total=r*g*b;
		for (i = 1; i < s.length-1; i++) {
			for (j = 1; Math.min(i-j, s.length-1-i-j) >=0; j++) {
				if(s[i-j]!=s[i]&&s[i]!=s[i+j]&&s[i-j]!=s[i+j]) total--;
			}
		}
		out.println(total);
	}
}

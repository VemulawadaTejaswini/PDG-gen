import java.util.*;
//import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] S = sc.next().toCharArray();
		sc.close();
		int n = 0;
		int w = 0;
		int s = 0;
		int e = 0;
		for (i = 0; i < S.length; i++) {
			switch(S[i]) {
			case 'N':
				n++;
				break;
			case 'W':
				w++;
				break;
			case 'S':
				s++;
				break;
			case 'E':
				e++;
				break;
			}
		}
		boolean f = true;
		if((n == 0 && s > 0) || n > 0 && s == 0) f = false;
		if((w == 0 && e > 0) || w > 0 && e == 0) f = false;
		out.println(f?"Yes":"No");
	}
}

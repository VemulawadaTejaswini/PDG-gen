import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	static int N;
	public static void main(String[] args) {
		int i, j, k;
		Scanner sc = new Scanner(System.in);
		N = parseInt(sc.next());
		sc.close();
		sc = null;
		int cnt=0;
		if(N>357) {
			cnt = m753("3");
			cnt += m753("5");
			cnt += m753("7");
		}
		out.println(cnt);
	}
	static int m753(String s) {
//		out.println(s);
		if(parseLong(s) > N) return 0;
		int i;
		int c3=0;
		int c5=0;
		int c7=0;
		int co=0;
		int ret = 0;
		for (i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case '3':
				c3++;
				break;
			case '5':
				c5++;
				break;
			case '7':
				c7++;
				break;
			default:
				co++;
				break;
			}
		}
		if(c3 > 0
		&& c5 > 0
		&& c7 > 0
		&& co ==0) {
			ret = 1;
		}
		String[] s753 = {"3","5","7"};
		for(i=0;i<s753.length; i++) {
			ret += m753(s+s753[i]);
		}
		return ret;
	}
}

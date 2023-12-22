import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();
		int cnt=0;
		for (i = 0, j = 0; i < s.length; i++) {
			if(s[i]==t[j]) {
				cnt++;
				j++;
			} else  {
				cnt = 0;
				j = 0;
			}
		}
		out.println(s.length + t.length - cnt);
	}
}

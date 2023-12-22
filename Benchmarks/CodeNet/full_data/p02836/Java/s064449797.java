import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		int cnt=0;
		for (i = 0; i < s.length/2; i++) {
			if(s[i]!=s[s.length-1-i]) cnt++;
		}
		out.println(cnt);
	}
}

import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		boolean f = false;
		int cnt=0;
		int len=s.length-1;
		do {
			f = false;
			for (i = 0; i < len; i++) {
				if(s[i]=='B'&&s[i+1]=='W') {
					s[i]='W';
					i++;
					s[i]='B';
					cnt++;
					f=true;
				}
			}
		} while(f);
		out.println(cnt);
	}
}

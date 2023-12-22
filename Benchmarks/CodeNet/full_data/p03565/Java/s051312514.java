import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static String UN = "UNRESTORABLE";
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();
		boolean f=false;
		int d = s.length - t.length;
		ArrayList<String> ans = new ArrayList<>();
		for (i = 0; i <= d; i++) {
			char[] ss = new char[s.length];
			for (j = 0; j < i; j++) {
				ss[j]=s[j]=='?'?'a':s[j];
			}
			for (j = 0; j < t.length; j++) {
				if(s[i+j]!=t[j]&&s[i+j]!='?') {
					break;
				}
				ss[i+j]=t[j];
			}
			if(j==t.length) {
				for (j=i+t.length;j < s.length; j++) {
					ss[j]=s[j]=='?'?'a':s[j];
				}
				ans.add(new String(ss));
				f=true;
			}
		}
		Collections.sort(ans);
		out.println(f?ans.get(0):UN);
	}
}

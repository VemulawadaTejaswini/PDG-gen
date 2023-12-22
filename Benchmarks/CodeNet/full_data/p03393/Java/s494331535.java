import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //GIMME AC
		Scanner input = new Scanner(System.in); 
		String S = input.next();
		int N = S.length();
		boolean[] vis = new boolean[200];
		String ans = "";
		for (int i = 0; i < N; i++) {
			vis[(int)(S.charAt(i))]=true;
		}
		if (N<26) {
			for (int i = 97; i <= 122; i++) {
				if (!vis[i]) {
					ans+=Character.toString((char)(i));
					break;
				} 
			}
			System.out.println(S+ans);
		}else {
			int latest = 0;
			for (int end = 24; end >= 0; end--) {
				char next = S.charAt(end+1);
				char cur = S.charAt(end);
				if ((int)(cur)<(int)(next)+1) {
					latest=end;
					break;
				}
			}
			if (latest!=0) {
				char prev = S.charAt(latest);
				ans+=S.substring(0,latest);
				int min = 300;
				for (int next = latest; next < N; next++) {
					if ((int)(S.charAt(next))>(int)(prev)) min=Math.min(min, (int)(S.charAt(next)));
				}
				ans+=Character.toString((char)(min));
			}
			System.out.println(ans.equals("")?-1:ans);
		}
	}
}
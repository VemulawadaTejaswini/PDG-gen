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
				if ((int)(cur)!=(int)(next)+1) {
					latest=end;
					break;
				}
			}
			if (latest!=0) {
				char prev = S.charAt(latest);
				ans+=S.substring(0,latest);
				vis = new boolean[200];
				for (int i = 0; i < ans.length(); i++) {
					vis[(int)(S.charAt(i))]=true;
				}
				for (int check = 97; check<=122; check++) {
					if (!vis[check]&&(char)(check)!=prev) {
						ans+=Character.toString((char)(check));
						break;
					}
				}
			}
		}
		System.out.println(ans.equals("")?-1:ans);
	}
}
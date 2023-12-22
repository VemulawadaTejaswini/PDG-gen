import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();
		sc.close();
		
		int s[] = new int[26];
		int t[] = new int[26];
		Arrays.fill(s, -1);
		Arrays.fill(t, -1);
		
		String ans ="Yes";
		for(int i=0;i<S.length();i++) {
			int a = S.charAt(i)-'a';
			int b = T.charAt(i)-'a';
			if(s[a]!=-1||t[b]!=-1) {
				if(s[a]!=b||t[b]!=a) {
					ans = "No";
					break;
				}
			}
			s[a]=b;
			t[b]=a;
		}
		System.out.println(ans);
	}
}

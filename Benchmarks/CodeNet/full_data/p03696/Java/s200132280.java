import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		StringBuilder sb = new StringBuilder(S);
		int cnt = 0;
		for(int i = 0; i < N - 1; i++) {
			if(sb.toString().substring(i - (cnt * 2), i + 2 - (cnt * 2)).equals("()")) {
				sb.delete(i, i + 2);
				i++;
				cnt++;
			}
		}
		StringBuilder ans = new StringBuilder(S);
		int left = 0;
		int right = 0;
		for(int i = 0; i < sb.toString().length(); i++) {
			if(sb.toString().substring(i, i + 1).equals(")")) {
				ans.insert(0, "(");
			} else {
				ans.append(")");
			}
		}
		System.out.println(ans.toString());
	}
}

import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		long count = 0;
		char c = ' ';
		long ans = 0;
		String SS = S+S;
		for (int i = 0; i < SS.length(); i++) {
				if (SS.charAt(i) == c) {
					count++;
					i++;
				}
				if (i >= SS.length())
					break;
				c = SS.charAt(i);
		}
		ans = count * K / 2;
		if (S.charAt(0) == S.charAt(S.length()-1)){
			if (K % 2 == 1)
				ans++;
		}
		System.out.println(ans);
	}
}

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		int[] cnt = new int[26];
		for(int i=0; i<S.length; i++)
			cnt[S[i]-'A']++;
		boolean ok = true;
		for(int i=0; i<26; i++)
			ok &= (cnt[i]==0 || cnt[i]==2);
		System.out.println(ok ? "Yes" : "No");
		
		sc.close();
	}
}

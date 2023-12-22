import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int N = s.length;
		int M = t.length;

		int[][] nextIndex = new int[26][N+1];
		for(int i=0; i<26; i++)
			Arrays.fill(nextIndex[i], -1);
		
		for(int i=N-1; i>=0; i--) {
			for(int j=0; j<26; j++) {
				nextIndex[j][i] = s[i]=='a'+j ? i : nextIndex[j][i+1];
			}
		}
		
		long ans = 0;
		int cur = 0;
		for(int i=0; i<M; i++) {
			if(nextIndex[t[i]-'a'][cur] < 0 ) {
				if(nextIndex[t[i]-'a'][0] < 0) {
					System.out.println(-1);
					sc.close();
					return;
				} else {
					ans += nextIndex[t[i]-'a'][0]+1 +N - cur;
					cur = nextIndex[t[i]-'a'][0]+1;
				}
			} else {
				ans += nextIndex[t[i]-'a'][cur]+1 - cur;
				cur = nextIndex[t[i]-'a'][cur]+1;
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}

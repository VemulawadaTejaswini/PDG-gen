import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int ans1 = 0, ans = 0;
		List<Integer> a = new ArrayList<>();
		int con = 1;
		if(N == 1)
			a.add(1);
		for(int i = 1; i < N; i++) {
			if(S[i] == S[i-1]) {
				con += 1;
			}
			else {
				a.add(con);
				con = 1;
			}
			if(i == N-1)
				a.add(con);
		}
		if(S[0] == '1') {
			LOOP:for(int i = 0; i < a.size(); i += 2) {
				ans1 = 0;
				for(int j = i; j <= i + K*2 && j < a.size(); j++) {
					ans1 += a.get(j);
				}
				ans = Math.max(ans, ans1);
				if(i + K*2 >= a.size())
					break LOOP;
			}
		}
		else {
			for(int i = 0; i < K*2 && i < a.size(); i++)
				ans += a.get(i);
			LOOP:for(int i = 1; i < a.size(); i += 2) {
				ans1 = 0;
				for(int j = i; j <= i + K*2 && j < a.size(); j++) {
					ans1 += a.get(j);
				}
				ans = Math.max(ans, ans1);
				if(i + K*2 >= a.size())
					break LOOP;
			}
		}
		System.out.println(ans);
		System.out.println(a.toString());
	}

}
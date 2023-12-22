import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int now = 0;
		StringBuilder ans = new StringBuilder();
		while(true){
			boolean ok = false;
			if(now + M >= N) {
				ans.append(N - now);
				break;
			}
			for(int i = M; i >= 1; i--) {
				if(s[now+i] == '0') {
					ans.append(i + " ");
					now += i;
					ok = true;
					break;
				}
			}
			if(!ok) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(ans);
	}

}
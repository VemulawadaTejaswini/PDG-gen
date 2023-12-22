import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S[] = new String[N];
		int num[] = new int[5];
		Arrays.fill(num, 0);
		for(int i = 0; i < N; i++) {
			S[i] = sc.next();
			if(S[i].substring(0, 1).equals("M")) {
				num[0]++;
			}
			if(S[i].substring(0, 1).equals("A")) {
				num[1]++;
			}
			if(S[i].substring(0, 1).equals("R")) {
				num[2]++;
			}
			if(S[i].substring(0, 1).equals("C")) {
				num[3]++;
			}
			if(S[i].substring(0, 1).equals("H")) {
				num[4]++;
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			if(num[i] > 0) {
				cnt++;
			}
		}
		if(cnt >= 3) {
			int ans = 1;
			if(cnt >= 4) {
				if(cnt == 5) {
					for(int i = 0; i < 5; i++) {
						if(num[i] > 0) {
							ans *= num[i];
						}
					}
					System.out.println(ans * 10);
					return;
				}
				for(int i = 0; i < 5; i++) {
					if(num[i] > 0) {
						ans *= num[i];
					}
				}
				System.out.println(ans * 2);
				return;
			}
			for(int i = 0; i < 5; i++) {
				if(num[i] > 0) {
					ans *= num[i];
				}
			}
			System.out.println(ans);
			return;
		} else {
			System.out.println(0);
			return;
		}
	}
}

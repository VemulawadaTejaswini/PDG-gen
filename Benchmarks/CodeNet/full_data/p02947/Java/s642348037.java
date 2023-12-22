
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[][] num = new int[n][26];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 26; j++) {
				num[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
			for(int j = 0; j < s[i].length(); j++) {
				num[i][s[i].charAt(j) - 'a']++;
			}
		}
		boolean[] flag = new boolean[n];
		for(int i = 0; i < n; i++) {
			flag[i] = false;
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {
			if(!flag[i]) {
				long tmp = 1;
				for(int j = i + 1; j < n; j++) {
					if(!flag[j]) {
						boolean ana = true;
						for(int k = 0; k < 26; k++) {
							if(num[i][k] != num[j][k]) {
								ana = false;
								break;
							}
						}
						if(ana) {
							tmp++;
							flag[j] = true;
						}
					}
				}
				if(tmp > 1) {
					ans += tmp * (tmp - 1) / 2;
				}
			}
		}
		System.out.println(ans);
	}

}

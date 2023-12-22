import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int[] golem = new int[N+2];
		Arrays.fill(golem, 1);
		for(int i = 0; i < Q; i++) {
			char t = sc.next().charAt(0);
			char d = sc.next().charAt(0);
			if(d == 'L') {
				for(int j = 1; j <= N; j++) {
					if(s[j-1] == t) {
						golem[j-1] += golem[j];
						golem[j] = 0;
					}
				}
			}
			else {
				for(int j = 1; j <= N; j++) {
					if(s[j-1] == t) {
						golem[j+1] += golem[j];
						golem[j] = 0;
					}
				}
			}
		}
		System.out.println(N + 2 - golem[0] - golem[N+1]);
	}

}
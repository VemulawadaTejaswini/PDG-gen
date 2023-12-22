
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] c = sc.next().toCharArray();
		int ans = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			if (c[i] == 'I') {
				++ans;
			}else if(c[i] == 'D') {
				--ans;
			}
			max = Math.max(max, ans);
		}
		System.out.println(max);
	}
}



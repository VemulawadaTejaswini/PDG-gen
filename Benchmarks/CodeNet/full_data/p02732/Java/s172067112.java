import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int[] ai = new int[n];
		int[] bi = new int[n];
		int ans = 0;
		for(int i = 0; i < n; i++) {
			ai[i] = sca.nextInt();
			bi[i] = ai[i];
		}

		for(int index = 0; index < n; index++) {
			ans = 0;
			ai = bi.clone();
			ai[index] = 0;
			Arrays.sort(ai);
			int num = 1;
			for(int i = 0; i < n-1; i++) {
				if(ai[i+1] == ai[i]) {
					num++;
				}
				else {
					ans += (num*(num-1))/2;
					num = 1;
				}
			}
			if(num > 1) {
				ans += (num*(num-1))/2;
			}
			System.out.println(ans);
		}


		// 後始末
		sca.close();
	}
}
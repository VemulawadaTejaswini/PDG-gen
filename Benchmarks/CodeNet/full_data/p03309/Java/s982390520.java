import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] map = new int[N];
		int totalP = 0;
		int totalN = 0;
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt() - (i + 1);
			if (map[i] > 0) {
				totalP += map[i];
			} else if (map[i] < 0) {
				totalN += map[i];
			}
		}
		
		//input3 OK
		if (totalP == Math.abs(totalN)) {
			System.out.println(totalP * 2);
			return;
		}
		
		Arrays.sort(map);
		
		//平均値でやっていたのが問題だった、中央値を求める
		int val = map[N / 2];
		
		int ans = 0;
		for (int i = 0; i < N; i++) {
			ans += Math.abs(map[i] - val);
		}
		System.out.println(ans);
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ans = 0;

		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int g = scanner.nextInt();

		int[][] map = new int[d][5];
		for (int i=0; i<d; i++){
			map[i][0] = (i+1)*100;	//点数
			map[i][1] = scanner.nextInt();	//問題数
			map[i][2] = scanner.nextInt();	//ボーナス
			map[i][3] = map[i][0]*map[i][1]+map[i][2];	//小計
			map[i][4] = map[i][3]/map[i][1];	//効率
		}

		Arrays.sort(map, (a,b)->b[4]-a[4]);

		int now = 0;
		int lbl = 0;
		for (int i=0; i<map.length; i++){
			now += map[i][3];
			ans += map[i][1];
			if (now > g) {
				int before = now - map[i][3];
				int ansB = ans - map[i][1];
				int[][] tmp = new int[map.length-lbl][5];
				for (int k=0;k<tmp.length;k++) tmp[k] = map[k + lbl];
				for (int[] arr:tmp) {
					if (ansB+arr[1]>g) ans = Math.min(ans, ansB+arr[1]);
				}
				Arrays.sort(tmp, (a,b)->b[0]-a[0]);
				for (int[] arr: tmp) {
					int need = (int)Math.ceil((g-before)/(float)arr[0]);
					if (need<arr[1]) ans = Math.min(ans, ansB+need);
				}
				break;
			}else {
				lbl++;
			}
		}
		System.out.println(ans);

	}
}
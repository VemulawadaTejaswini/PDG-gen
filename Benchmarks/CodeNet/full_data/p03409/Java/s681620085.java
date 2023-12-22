/*
 * x座標の大きい赤い点から順にy座標の小さい青い点とペアを作る
 * 赤:1000x+y, 青:x+1000yで座標を保存する
 */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] red = new int[n];
		for (int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			red[i] = 1000*x + y;
		}
		int[] blue = new int[n];
		for (int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			blue[i] = x + 1000*y;
		}
		Arrays.sort(red);
		Arrays.sort(blue);
		
		int ans = 0;
		for (int i=n-1;i>=0;i--) {
			int rx = red[i]/1000;
			int ry = red[i]%1000;
			for (int j=0;j<n;j++) {
				int bx = blue[j]%1000;
				int by = blue[j]/1000;
				if (ry<by) {
					if (rx<bx) {
						ans++;
						blue[j] = 0;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
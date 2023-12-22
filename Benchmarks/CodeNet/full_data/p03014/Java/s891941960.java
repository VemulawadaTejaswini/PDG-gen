import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		String S_temp[] = new String[H];
		String S[][] = new String[H][W];
		int n[][] = new int[H][W];
		int side[][] = new int[H][W];
		int vertical[][] = new int[H][W];
		for(int i = 0 ; i < H; i++) {
			String temp = sc.next();
			for(int j = 0 ; j < W; j++) {
				S[i][j] = temp.substring(j, j + 1);
			}
		}
		
		for(int i = 0 ; i < H; i++) {
			int cnt = 0;
			for(int j = 0 ; j < W; j++) {
				if(S[i][j].equals(".")) {
					cnt++;
					if(j == W - 1) {
						for(int k = 0; k < cnt; k++) {
							side[i][j - k] = cnt;
						}
						cnt = 0;
					}
				} else {
					for(int k = 1; k <= cnt; k++) {
						side[i][j - k] = cnt;
					}
					cnt = 0;
				}
			}
		}
		
		for(int i = 0 ; i < W; i++) {
			int cnt = 0;
			for(int j = 0 ; j < H; j++) {
				if(S[j][i].equals(".")) {
					cnt++;
					if(j == H - 1) {
						for(int k = 0; k < cnt; k++) {
							vertical[j - k][i] = cnt;
						}
						cnt = 0;
					}
				} else {
					for(int k = 1; k <= cnt; k++) {
						vertical[j - k][i] = cnt;
					}
					cnt = 0;
				}
			}
		}
		
		int ans = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				ans = Math.max(ans, side[i][j] + vertical[i][j] - 1);
			}
		}
		
		System.out.println(ans);
	}
}
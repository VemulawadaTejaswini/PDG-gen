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
			for(int j = 0 ; j < W; j++) {
				if(S[i][j].equals("#")) continue;
				
				int cnt = 0;
				while(j + cnt < W) {
					if(S[i][j + cnt].equals("#")) break;
					cnt++;
				}
				
				for(int k = 0; k < cnt; k++) {
					side[i][j + k] = cnt;
				}
				j += cnt;
			}
		}

		for(int i = 0 ; i < W; i++) {
			for(int j = 0 ; j < H; j++) {
				if(S[j][i].equals("#")) continue;
				
				int cnt = 0;
				while(j + cnt < H) {
					if(S[j + cnt][i].equals("#")) break;
					cnt++;
				}
				
				for(int k = 0; k < cnt; k++) {
					vertical[j + k][i] = cnt;
				}
				j += cnt;
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
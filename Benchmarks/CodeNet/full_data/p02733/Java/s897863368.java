import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		String[] S = new String[H];
		for ( int h = 0 ; h < H ; h++ ) {
			S[h] = sc.next();
		}
		sc.close();

		int[] map = new int[W];
		for ( int w = 0 ; w < W ; w++ ) {
			for ( int h = 0 ; h < H ; h++ ) {
				if ( S[h].charAt(w) == '1' ) {
					map[w] += 1 << h;
				}
			}
		}

		int minCut = Integer.MAX_VALUE;
		OUTER:for ( int div = 0 ; div < (1 << (H - 1)) ; div++ ) {
			int[] block = new int[11];
			int blockCnt = 1;
			for ( int h = 0 ; h < H - 1 ; h++ ) {
				if ( ((div >> h) & 1) == 1 ) {
					block[blockCnt++] = h + 1;
				}
			}
			block[blockCnt] = H;
			int divCnt = blockCnt - 1;

			int[] whiteCnt = new int[blockCnt];
			int[] curCnt = new int[blockCnt];
			for ( int w = 0 ; w < W ; w++ ) {
				Arrays.fill(curCnt, 0);
				int b = 0;
				boolean over = false;
				for ( int h = 0 ; h < H ; h++ ) {
					if ( h >= block[b + 1] ) {
						b++;
					}
					if ( ((map[w] >> h) & 1) != 0 ) {
						curCnt[b]++;
						if ( whiteCnt[b] + curCnt[b] > K ) {
							if ( curCnt[b] > K ) {
								continue OUTER;
							}
							over = true;
						}
					}
				}
				if ( over ) {
					for ( int bb = 0 ; bb < blockCnt ; bb++ ) {
						whiteCnt[bb] = curCnt[bb];
					}
					divCnt++;
				} else {
					for ( int bb = 0 ; bb < blockCnt ; bb++ ) {
						whiteCnt[bb] += curCnt[bb];
					}
				}
			}
			minCut = Math.min(minCut, divCnt);
		}

		System.out.println(minCut);
	}
}

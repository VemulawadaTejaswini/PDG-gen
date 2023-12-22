import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] A = new char[H][W];
		for(int i = 0; i < H; i++)
			A[i] = sc.next().toCharArray();
		int ans = 0;
		int[][] dist = new int[H][W];
		for(int i = 0; i < H; i++) 
			Arrays.fill(dist[i], 100000000);
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(A[i][j] == '.') {
					for(int k = j; k < W; k++) {
						if(A[i][k] == '#') {
							dist[i][j] = k-j;
							break;
						}
					}
					for(int k = 0; k < j; k++) {
						if(A[i][k] == '#') {
							dist[i][j] = Math.min(dist[i][j],j-k);
							break;
						}
					}
					for(int k = i; k < H; k++) {
						if(A[k][j] == '#') {
							dist[i][j] = Math.min(dist[i][j],k-i);
							break;
						}
					}
					for(int k = 0; k < i; k++) {
						if(A[k][j] == '#') {
							dist[i][j] = Math.min(dist[i][j],i-k);
							break;
						}
					}
				}
				else
					dist[i][j] = 0;
			}
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(A[i][j] == '.') {
					for(int k = j; k < W; k++) {
						dist[i][j] = Math.min(dist[i][j], k-j+dist[i][k]);
					}
					for(int k = 0; k < j; k++) {
						dist[i][j] = Math.min(dist[i][j], j-k+dist[i][k]);
					}
					for(int k = i; k < H; k++) {
						dist[i][j] = Math.min(dist[i][j], k-i+dist[k][j]);
					}
					for(int k = 0; k < i; k++) {
						dist[i][j] = Math.min(dist[i][j], i-k+dist[k][j]);
					}
				}
			}
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++)
				ans = Math.max(ans,dist[i][j]);
		}
		System.out.println(ans);
	}

}
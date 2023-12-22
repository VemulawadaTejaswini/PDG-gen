import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = Integer.parseInt(sc.next());
		int H = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		int[] X = new int[N];
		int[] Y = new int[N];
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			X[i] = Integer.parseInt(sc.next());
			Y[i] = Integer.parseInt(sc.next());
			A[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int[][] blk = new int[W][H];
		for(int i = 0;i < W;i++) {
			for(int j = 0;j < H;j++) {
				blk[i][j] = 0;
			}
		}
		for(int i = 0;i < N;i++) {
			switch(A[i]){
			case 1:
				for(int j = 0;j < X[i];j++) {
					for(int k = 0;k < H;k++) {
						blk[j][k]++;
					}
				}
				break;
			case 2:
				for(int j = X[i];j < W;j++) {
					for(int k = 0;k < H;k++) {
						blk[j][k]++;
					}
				}
				break;
			case 3:
				for(int j = 0;j < W;j++) {
					for(int k = 0;k < Y[i];k++) {
						blk[j][k]++;
					}
				}
				break;
			case 4:
				for(int j = 0;j < W;j++) {
					for(int k = Y[i];k < H;k++) {
						blk[j][k]++;
					}
				}
				break;
			}
		}
		int ans = 0;
		for(int i = 0;i < W;i++) {
			for(int j = 0;j < H;j++) {
				if(blk[i][j] == 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
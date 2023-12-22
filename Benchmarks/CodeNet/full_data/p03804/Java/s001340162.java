import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean[][] A = new boolean[N][N];
		boolean[][] B = new boolean[M][M];
		for(int i = 0;i < N;++i) {
			String s = sc.next();
			for(int j = 0;j < N;++j) {
				A[j][i] = s.charAt(j) == '.' ? true : false;
			}
		}
		for(int i = 0;i < M;++i) {
			String s = sc.next();
			for(int j = 0;j < M;++j) {
				B[j][i] = s.charAt(j) == '.' ? true : false;
			}
		}
		sc.close();
		
		boolean ans = false;
		for(int ax = 0;ax < N-M;++ax) {
			for(int ay = 0;ay < N-M;++ay) {
				boolean flag = true;
				for(int bx = 0;bx < M;++bx) {
					for(int by = 0;by < M;++by) {
						if(A[ax+bx][ay+by] != B[bx][by]) {
							flag = false;
							break;
						}
					}
					if(!flag)break;
				}
				if(flag) {
					ans = true;
					break;
				}
			}
			if(ans)break;
		}
		if(ans)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

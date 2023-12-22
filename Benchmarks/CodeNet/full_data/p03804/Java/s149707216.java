import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char A[][] = new char[N][N];
		char B[][] = new char[M][M];
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			for(int j = 0; j < N; j++) {
				A[i][j] = str.charAt(j);
			}
		}
		for(int i = 0; i < M; i++) {
			String str = sc.next();
			for(int j = 0; j < M; j++) {
				B[i][j] = str.charAt(j);
			}
		}
		
		boolean flag = false;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				int flagCnt = 0;
				do{
					if(A[i + flagCnt / M][j + flagCnt % M] == B[flagCnt / M][flagCnt % M]) {
						flagCnt++;
					} else {
						flagCnt = 0;
					}
					if(flagCnt == M * M) {
						flag = true;
						break;
					}
					if(flag) break;
				} while (flagCnt != 0);
			}
		}
		
		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

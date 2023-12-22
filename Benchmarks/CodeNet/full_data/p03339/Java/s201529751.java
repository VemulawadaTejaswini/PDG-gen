
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		int[][] A = new int[2][N+2];

		for(int i = 1 ; i <= N ; i++){
			if(String.valueOf(S.charAt(i-1)).equals("E")){
				A[0][i] = A[0][i-1] + 1;
			}
			else{
				A[0][i] = A[0][i-1];
			}
			if(String.valueOf(S.charAt(i-1)).equals("W")){
				A[1][i] = A[1][i-1] + 1;
			}
			else{
				A[1][i] = A[1][i-1];
			}
		}

/*
		for(int i = 0 ; i < 2  ; i++){
			for(int j = 1 ; j <= N ; j++){
				System.out.print(A[i][j] + " ");
			}
			System.out.println(" ");
		}
*/
		int ans = 300001;
		int tmp = 0;
		for(int i = 1 ; i <= N ; i++){
			tmp = (A[0][N] - A[0][i]) + A[1][i-1];
			ans = Math.min(tmp, ans);
		}

		System.out.println(ans);

	}

}
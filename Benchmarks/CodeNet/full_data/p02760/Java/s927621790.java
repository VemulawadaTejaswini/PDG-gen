import java.util.Scanner;

public class Main {
	static String s = "";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String ans = "No";

		//Aをとる
		int[][] A = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		//N
		int N = sc.nextInt();

		//b
		int[] b = new int[N];
		for(int i=0; i<N; i++) {
			b[i] = sc.nextInt();
		}

		//穴をあける
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<N; k++) {
					if(A[i][j] == b[k])
						A[i][j] = 0;
				}
			}
		}

		//ビンゴか確認
		//横一列
		for(int i=0; i<3; i++) {
			if(A[i][0] == 0 && A[i][1] == 0 && A[i][2] == 0)
				ans = "Yes";
		}

		for(int j=0; j<3; j++) {
			if(A[0][j] == 0 && A[1][j] == 0 && A[2][j] == 0)
				ans = "Yes";
		}

		if(A[0][0] == 0 && A[1][1] == 0 && A[2][2] == 0)
			ans = "Yes";
		if(A[0][2] == 0 && A[1][1] == 0 && A[2][0] == 0)
			ans = "Yes";

		System.out.println(ans);

	}

}

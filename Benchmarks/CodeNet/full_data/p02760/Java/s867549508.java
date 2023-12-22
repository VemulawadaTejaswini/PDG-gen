import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[3][3];
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 3;j++){
				A[i][j] = sc.nextInt();
			}
		}
		int N = sc.nextInt();
		int[] b = new int[N];
		boolean[][] bi = new boolean[3][3];
		for(int i = 0;i < N;i++){
			b[i] = sc.nextInt();
			for(int j = 0;j < 3;j++){
				for(int k = 0;k < 3;k++){
					if(b[i]==A[j][k]){
						bi[j][k] = true;
					}
				}
			}
		}
		sc.close();
		boolean ans = false;
		for(int i = 0;i < 3;i++){
			int cnt = 0;
			for(int j = 0;j < 3;j++){
				if(bi[i][j])cnt++;
			}
			if(cnt == 3){
				ans = true;
			}
		}
		for(int i = 0;i < 3;i++){
			int cnt = 0;
			for(int j = 0;j < 3;j++){
				if(bi[j][i])cnt++;
			}
			if(cnt == 3){
				ans = true;
			}
		}
		if((bi[0][0]&&bi[1][1]&&bi[2][2]) ||
				(bi[0][2]&&bi[1][1]&&bi[2][0])){
			ans = true;
		}
		System.out.println(ans ? "Yes" : "No");
	}

}
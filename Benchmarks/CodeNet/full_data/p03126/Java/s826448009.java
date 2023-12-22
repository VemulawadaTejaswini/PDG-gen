import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int c [][] = new int [N][M+1];
		for (int i=0; i<N; i++){
			int K = sc.nextInt();
			
			for (int j=0; j<K; j++){
				int cij=sc.nextInt();
				c[i][cij]=1;
			}
		}
		int ans = 0;
		for (int j=1; j<M+1; j++){
			int temp = 0;
			for  (int i=0; i<N; i++){
			temp+=c[i][j];
			}
			if (temp==N)
				ans++;
		}
		System.out.println(ans);
		sc.close();

	}

}

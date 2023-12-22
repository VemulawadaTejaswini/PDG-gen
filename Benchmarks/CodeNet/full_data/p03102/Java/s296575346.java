//2019/3/12 10分
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int M = sc.nextInt();

		int C = sc.nextInt();

		int[] B = new int[M];

		for(int i=0;i<M;i++) B[i] = sc.nextInt();

		int[] A = new int[N*M];

		for(int i=0;i<N*M;i++) A[i] = sc.nextInt();

		int ans = 0;

		int x = 0;

		for(int i=0;i<N;i++) {

			x = 0;

			for(int j=0;j<M;j++) {

				x += B[j] * A[j+(i*M)];
			}

			if(x+C>0) ans++;

		}

		System.out.println(ans);
	}

}

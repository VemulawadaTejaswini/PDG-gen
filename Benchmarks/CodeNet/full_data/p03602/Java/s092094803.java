import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[][] = new long[N][N];
		long B[][] = new long[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				A[i][j]=B[i][j]=sc.nextLong();
			}
		}
		sc.close();
 		
		for(int k=0;k<N;k++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(A[i][j]==A[i][k]+A[k][j]) {
						if(i==j||j==k||k==i)continue;
						B[i][j]=0;
					}
					if(A[i][j]>A[i][k]+A[k][j]) {
						System.out.println(-1);
						return;
					}
				}
			}
		}
		long sum = 0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				sum += B[i][j];
			}
		}
		System.out.println(sum);
	}
}
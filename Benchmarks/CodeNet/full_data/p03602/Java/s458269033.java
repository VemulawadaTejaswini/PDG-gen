import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[][] A = new long[N][N];
		long[][] a = new long[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				long temp = sc.nextLong();
				A[i][j] = temp;
				a[i][j] = temp;
			}
		}
		sc.close();
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(i != j && A[i][k] + A[k][j] < A[i][j]) {
						System.out.println(-1);
						return;
					}
				}
			}
		}
		long ans = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				boolean flag = true;
				for(int k=0; k<N; k++) {
					if(k!=i && k!=j && a[i][j] == a[i][k]+a[k][j]) {
						flag = false;
						break;
					}
				}
				if(flag) {
					ans += a[i][j];
				}
			}
		}
		System.out.println(ans/2);
	}

}

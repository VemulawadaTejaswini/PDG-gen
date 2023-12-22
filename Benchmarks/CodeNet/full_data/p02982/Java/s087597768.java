import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int[][] x = new int[N][D];
		for (int i=0;i<N;i++) {
			for (int j=0;j<D;j++) {
				x[i][j] = Integer.parseInt(sc.next());
			}
		}
		int ans = 0;
		for (int i=0;i<N;i++) {
			for (int j=i+1;j<N;j++) {
				int sum = 0;
				for (int k=0;k<D;k++) {
					sum += (x[j][k]-x[i][k])*(x[j][k]-x[i][k]);
				}
				if (Math.abs(Math.sqrt(sum)-Math.floor(Math.sqrt(sum))) < 0.00000001) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
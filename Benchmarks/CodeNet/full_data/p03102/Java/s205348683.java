import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int[] B = new int[m];
		int[][] A = new int[n][m];
		for(int i=0;i<m;i++) {B[i] = Integer.parseInt(sc.next());}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++){
				A[i][j] = Integer.parseInt(sc.next());
			}
		}

		int cnt = 0;
		for(int i=0;i<n;i++) {
			long num = c;
			for(int j=0;j<m;j++) {
				num += A[i][j]*B[j];
			}
			if(num>0)cnt++;
		}
		System.out.println(cnt);
	}

}

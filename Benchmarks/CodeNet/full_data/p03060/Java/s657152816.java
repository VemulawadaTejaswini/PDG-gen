import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int x = 0, y = 0;
			int array[][] = new int [2][n];
			for (int  i = 0;i<2;i++) {
				for(int j = 0;j<n;j++) {
					array[i][j] = sc.nextInt();
				}
			}
			for(int i = 0; i<n;i++) {
			if(array[0][i]>array[1][i]) {
				x+=array[0][i];
				y+=array[1][i];
			}
		}
			System.out.println(x-y);
			
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}

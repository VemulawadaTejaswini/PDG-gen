import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		int ans = n;	//l=rはすべて大威を満たすので，最初からっそれを入れておく
		int[][] xor = new int[n][n];	//インデックスはlとr
		int[][] sum = new int[n][n];

		for(int i = 0; i < n; i++) {
			xor[i][i] = a[i];
			sum[i][i] = a[i];
		}
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				xor[i][j] = xor[i][j-1]^a[j];
				sum[i][j] = sum[i][j-1]+a[j];
				if(xor[i][j] == sum[i][j]) {
					ans++;
				}
			}
		}

		System.out.println(ans);

	}

}
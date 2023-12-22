import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		int bc[][] = new int[2][m];
		for(int i = 0; i < m; i++){
			bc[0][i] = sc.nextInt();
			bc[1][i] = sc.nextInt();
		}
		Arrays.sort(bc,(b,c) -> Integer.compare(b[1],c[1]));
		for(int j = m-1; j >= 0; j--){
			Arrays.sort(a);
			for(int k = 0; k < n&&k < bc[0][j]&&a[k] < bc[1][j]; k++){
				a[k] = bc[1][j];
			}
		}
		long ans = 0;
		for(int i = 0; i < n; i++){
			ans = (long)ans+a[i];
		}
		System.out.print(ans);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int count = 0;
		char[][] a = new char[n][n];
		char[][] b = new char[m][m];

		for(int i = 0; i < n; i++){
			a[i] = scanner.next().toCharArray();
		}
		for(int i = 0; i < m; i++){
			b[i] = scanner.next().toCharArray();
		}

		for(int i = 0; i < n-m; i++){
			count = 0;
			int l = 0;
			for(int j = 0; j < n-m; j++){
				if(a[i][j] == b[0][l]){
					count++;
					for(int k = 1; k < m; k++){
						if(a[i+k][j] == b[k][l]){
							count++;
							l++;
						}
					}
				}
			}
			if(count == m*m){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] a = new int[2][n];
		for(int i=0;i<2;i++){
			for(int j=0;j<n;j++){
				a[i][j] = scanner.nextInt();
			}
		}
		int max = 0, sum = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				sum += a[0][j];
			}
			for(int j=i;j<n;j++){
				sum += a[1][j];
			}
			max = Math.max(max, sum);
			sum = 0;
		}
		System.out.println(max);
	}

}

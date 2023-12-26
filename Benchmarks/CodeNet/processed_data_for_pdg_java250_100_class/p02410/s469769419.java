public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int matrixA[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				matrixA[i][j] = sc.nextInt();
			}
		}
		int vectorB[] = new int[m];
		for(int i=0; i<m; i++) {
			vectorB[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=0; j<m; j++) {
				sum += matrixA[i][j] * vectorB[j];
			}
			System.out.println(sum);
		}
	}
}

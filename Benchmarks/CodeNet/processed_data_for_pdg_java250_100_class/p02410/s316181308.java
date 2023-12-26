public class Main {
	public static void main(String[] args) {
		int m = 0;
		int n = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		int[][] matrixA = new int[n][m];
		int[] vectorB = new int[m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int matNum = scan.nextInt();
				matrixA[i][j] = matNum;
			}
		}
		for (int j = 0; j < m; j++) {
			int vecNum = scan.nextInt();
			vectorB[j] = vecNum;
		}
		for (int i = 0; i < n; i++) {
			int sumResult = 0;
			for (int j = 0; j < m; j++) {
				int sum = (matrixA[i][j]) * (vectorB[j]);
				sumResult += sum;
			}
			System.out.println(sumResult);
		}
		scan.close();
	}
}

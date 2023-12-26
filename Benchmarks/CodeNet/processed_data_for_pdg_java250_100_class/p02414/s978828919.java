public class Main {
	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		int l = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		l = scan.nextInt();
		int[] [] matrixA = new int[n] [m];
		int[] [] matrixB = new int[m] [l];
		long[] [] matrixC = new long[n] [l];
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				int numA = scan.nextInt();
				matrixA[i] [j] = numA;
			}
		}
		for (int i = 0; i < m; i++){
			for (int j = 0; j < l; j++){
				int numB = scan.nextInt();
				matrixB[i] [j] = numB;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				for (int k = 0; k < m; k++) {
					int productResult = (matrixA[i] [k]) * (matrixB[k] [j]);
					matrixC [i] [j] += productResult;
				}
				System.out.print(matrixC[i] [j]);
				if (j == l - 1) {
					break;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		scan.close();
	}
}

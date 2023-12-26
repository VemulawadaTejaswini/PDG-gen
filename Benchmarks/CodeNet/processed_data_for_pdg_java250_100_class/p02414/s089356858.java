public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intN = sc.nextInt();
		int intM = sc.nextInt();
		int intL = sc.nextInt();
		int[][] gyoua = new int[intN][intM];
		int[][] gyoub = new int[intM][intL];
		long[][] gyouc = new long[intN][intL];
		for (int i = 0; i < intN; i++) {
			for (int j = 0; j < intM; j++) {
				gyoua[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < intM; i++) {
			for (int j = 0; j < intL; j++) {
				gyoub[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < intN; i++) {
			for (int j = 0; j < intL; j++) {
				for (int k = 0; k < intM; k++) {
					gyouc[i][j] += gyoua[i][k] * gyoub[k][j];
				}
				System.out.print(gyouc[i][j]);
				if (j != intL - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

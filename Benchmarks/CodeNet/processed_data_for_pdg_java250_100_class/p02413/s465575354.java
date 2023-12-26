public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] array = new int[r + 1][c + 1];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				array[i][j] = sc.nextInt();
				array[i][c] += array[i][j];
				array[r][j] += array[i][j];
			}
		}
		for (int i = 0; i < c; i++) {
			array[r][c] += array[r][i];
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				if (j >= 0 && j < array[i].length -1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

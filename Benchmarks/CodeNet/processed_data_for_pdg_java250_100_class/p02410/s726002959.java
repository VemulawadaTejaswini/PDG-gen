public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lineArray = line.split("[\\s]+");
		int n = Integer.parseInt(lineArray[0]);
		int m = Integer.parseInt(lineArray[1]);
		int[][] array = new int[n][m];
		int[] vector = new int [m];
		long[] c = new long[n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < vector.length; i++) {
			vector[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				c[i] += array[i][j] * vector[j]; 
			}
		}
		for (long l : c) {
			System.out.println(l);
		}
	}
}

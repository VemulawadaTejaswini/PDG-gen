public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);
		int[][] matrix = new int[n][m];
		int[] vector = new int[m];
		for(int i = 0; i < n; i++){
			tmpArray = br.readLine().split(" ");
			for(int j = 0; j < m; j++){
				matrix[i][j] = Integer.parseInt(tmpArray[j]);
			}
		}
		for(int i = 0; i < m; i++){
			vector[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < n ; i++){
			int sum = 0;
			for(int j = 0; j < m; j++){
				sum += matrix[i][j]*vector[j];
			}
			System.out.println(sum);
		}
	}
}

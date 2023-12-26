public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line  = br.readLine().split(" ");
		int n=0,m=0;
		n = Integer.parseInt(line[0]); 
		m = Integer.parseInt(line[1]); 
		int[][] vector_A = new int[n][m]; 
		int[] vector_B = new int[m]; 
		for (int i = 0; i < n; i++) {
			String [] data = br.readLine().split(" ");
			for	(int j= 0; j < m; j++){
				vector_A[i][j] = Integer.parseInt(data[j]);
			}
		}
		for (int i = 0; i < m; i++) {
			String data2 = br.readLine();
			vector_B[i] = Integer.parseInt(data2);
		}
		for (int i = 0; i < n; i++) {
			int tot = 0;
			for (int j = 0; j < m; j++) {
				tot += vector_A[i][j] * vector_B[j];
			}
			System.out.println(tot);
		}
	}
}

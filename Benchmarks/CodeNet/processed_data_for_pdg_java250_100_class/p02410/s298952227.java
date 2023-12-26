public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] Aandb = (input.readLine()).split("\\s");
		int n = Integer.parseInt(Aandb[0]);
		int m = Integer.parseInt(Aandb[1]);
		int[][] A = new int[n][m];
		String[] z = null; 
		for (int i = 0; i < n; i++) {
			z = (input.readLine()).split("\\s");
			for (int j = 0; j < m; j++) {
				A[i][j] = Integer.parseInt(z[j]);
			}
		}
		int[] b = new int[m];
		for (int k = 0; k < m; k++) {
			b[k] = Integer.parseInt(input.readLine());
		}
		for (int l = 0; l < n; l++) {
			int C = 0;
			for (int s = 0; s < m; s++){
				C += (A[l][s] * b[s]);
			}
			System.out.println(C);
		}
	}
}

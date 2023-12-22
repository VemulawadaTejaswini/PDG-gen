import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
		System.out.println(metodo());
	}
	
	public static long metodo() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = br.readLine().split(" ");
		int N = Integer.parseInt(line1[0]);
		int W = Integer.parseInt(line1[1]);
		int[] n1 = new int[N+1];
		int[] n2 = new int[N+1];
		for(int i = 1; i <= N ; i++) {
			line1 = br.readLine().split(" ");
			n1[i] = Integer.parseInt(line1[0]);
			n2[i] = Integer.parseInt(line1[1]);
		}
		
		long[][] matrix = new long[N+1][W+1];
		
		
		for(int i = 1; i <= N ; i++) {
			for(int w = 1; w <= W ; w++) {
				matrix[i][w] = matrix[i-1][w];
				if(w >= n1[i]) {
					 matrix[i][w] = Math.max(matrix[i][w], n2[i]+ matrix[i-1][w-n1[i]]);
				}
			}
		}
		
		return matrix[N][W];
	}
}

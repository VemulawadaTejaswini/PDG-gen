import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		char[][] matA = new char[n][n];
		char[][] matAEx = new char[2*n][2*n];
		
		for(int i = 0; i < n; i++){
			String tmpArray = br.readLine();
			
			for(int j = 0; j < n; j++){
				matA[i][j] = tmpArray.charAt(j);
				matAEx[i][j] = matA[i][j];
				matAEx[i+n][j] = matA[i][j];
				matAEx[i][j+n] = matA[i][j];
				matAEx[i+n][j+n] = matA[i][j];
			}
		}
		
		char[][] matB = new char[n][n];
		
		//配列の転地コピー
		
		long result = 0;
		for(int a = 0; a < n; a++){
			for(int b = 0; b < n; b++){
//				System.out.println("a = "+a+" b = "+b);
				boolean good = true;
				for(int i = 0; i < n; i++){
					for(int j = i + 1; j < n; j++){	
						int A = i - a + n;
//						if(A < 0){
//							A += n;
//						}
						
						int B = j - b + n;
//						if(B < 0){
//							B += n;
//						}
//						System.out.println(i+" "+j+" "+A+" "+B);
//						matB[i][j] = matA[A][B];
//						matB[j][i] = matA[B][A];
						
//						if(matB[i][j] != matB[j][i]){
						if(matAEx[i + a][j + b] != matAEx[j + a][i + b]){
							good = false;
							break;
						}
					}
					
					if(!good){
						break;
					}
				}
				
				if(good){
					result++;
				}
			}
		}
		
		System.out.println(result);
	}
}


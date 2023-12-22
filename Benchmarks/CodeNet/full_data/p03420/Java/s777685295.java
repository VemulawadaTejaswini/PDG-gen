import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpArray[0]);
		int k = Integer.parseInt(tmpArray[1]);
		
		long result = 0;
		
		if(k == 0){
			result = (long)n*n;
			System.out.println(result);
			return;
		}
		for(int b = k + 1; b <= n ; b++){
//			System.out.println(" b = "+b);
			//余り
			for(int baseA = k; baseA < b; baseA++){
//				if(baseA % b < k){
//					break;
//				}
				
//				result += (n - baseA)/b;
//				/*
				for(int a = baseA; a <= n; a += b){
//					System.out.println("a "+a+" b "+b);
					result++;

				}
			}
		}
//		for(int i = Math.max(1, k); i <= n; i++){
//			for(int j = 1; j <= n; j++){
//				if(i%j >= k){
//					if(i < j){
//						result += n - i;
//						break;
//					}
//					else {
//						result ++;
//					}
//				}
//			}
//		}
		
		System.out.println(result);
	}

}

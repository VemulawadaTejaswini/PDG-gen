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
		
		int n = Integer.parseInt(br.readLine());
		
		long[] a = new long[n];
		long[] na = new long[n];
		long[] b = new long[n];
		long[] nb = new long[n];

		String[] tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			a[i] = Long.parseLong(tmpArray[i]);
			na[i] = n*a[i];
		}
		
		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			b[i] = Long.parseLong(tmpArray[i]);
			nb[i] = n*b[i];
		}
		
		
		long result = 0;
		
//		for(int i = 0; i < n; i++){
//			result ^= na[i];
//		}
//		
//		for(int i = 0; i < n; i++){
//			result ^= nb[i];
//		}
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				long tmp = a[i] + b[j];
				result ^= tmp;
			}
		}
		
		System.out.println(result);
		
//		if(n % 2 == 1){
//			for(int i = 0; i < n; i++){
//				a[i] = a[i]^a[i];
//				b[i] = a[i]^b[i];
//			}
//		}
	}
}

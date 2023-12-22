import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int i = 1;
		int j = 2;
		int k = 2;
//		
//		long bunsiTest = 4*3498*3498*3498;
//		long bunboTest = 3498*3498+3498*3498+3498*3498;
//		System.out.println(bunsiTest/bunboTest);
		
		for(i = n/4+1; i <= 3500; i++){
//			System.out.println("i = "+i);
			if(i % 2 == 0){
				j = i;
			}
			if(i % 2 == 1){
				j = i + 1;
			}
			for(j = Math.max(j, n*i/(4*i - n) + 1); j <= 3500; j += 2){
				for(k = j; k <= 3500 ; k += 2 ){
					long bunsi = (long)4*i*j*k;
//					System.out.println("test");
					long bunbo = (long)i*j + j*k + k*i;
					
					if(bunsi % bunbo == 0 && bunsi / bunbo == n){
						System.out.println(i+" "+j+" "+k);
//						break;
						return;
					}
				}
			}
		}
		
	}
	
	

}

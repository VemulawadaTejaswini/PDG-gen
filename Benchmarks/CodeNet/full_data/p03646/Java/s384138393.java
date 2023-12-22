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
		long k = Long.parseLong(br.readLine());
		
		long n = 2;
		long[] array = null;

		for(int i = 2; i <= 2 ; i++){
			//配列初期化
			array = new long[i];
			for(int j = 0; j < i; j++){
				array[j] = j;
			}
			
			long throughTimes = k/i;
			
			for(int j = 0; j < i ; j++){
				array[j] += throughTimes;
			}
			
			for(int j = 0; j < k%i ; j++){
				for(int l = 0; l < i; l++){
					if(j == l){
						array[l] += i;
					}
					else {
						array[l]--;
						if(array[l]<0){
							System.out.println("error!!");
						}
					}
				}
			}
		}
		
		System.out.println(n);
		for(int i = 0; i < array.length ; i++){
			if(i == 0){
				System.out.print(array[i]);
			
			}
			else{
				System.out.print(" "+array[i]);
				
			}
		}
	}

}

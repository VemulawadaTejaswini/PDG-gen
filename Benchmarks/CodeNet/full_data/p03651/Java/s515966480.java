import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


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
		int m = Integer.parseInt(tmpArray[1]);
		
		int[] input = new int[n];
		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
		}
		
		//互いに素かチェック
		boolean isCoprime = false;
		Arrays.sort(input);
		for(int i = 1; i < input.length ; i++){
			if(input[i]%input[0] != 0){
				isCoprime = true;
				break;
			}
		}
		
		if(isCoprime){
			System.out.println("POSSIBLE");
		}
		else if( m%input[0] == 0 || input[0]%m == 0){
			System.out.println("POSSIBLE");
		}
		else {
			System.out.println("IMPOSSIBLE");
		}
	}

}

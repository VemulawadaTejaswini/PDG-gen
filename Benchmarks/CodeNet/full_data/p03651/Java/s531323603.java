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
		
		Arrays.sort(input);
		int G = GCD(input);
		//System.out.println(G);
		
		//kが最大値以下かつGで割り切れればOK
		if(m <= input[input.length - 1] && m % G == 0){
			System.out.println("POSSIBLE");
		}
		else{
			System.out.println("IMPOSSIBLE");
		}

	}
		
	
	static int GCD (int[] array){
		//int[] copyArray = Arrays.copyOf(array, array.length);
		
		int result = array[0];
		for(int i = 0; i < array.length - 1 ; i++){
			result = GCD(result, array[i + 1]);
		}
		
		return result;
	}
	
	static int GCD (int a, int b){
		
		while(a != b){
			//System.out.println(a+" "+b);
			if(b > a){
				int tmp = a;
				a = b;
				b = tmp;
			}
			if(a%b == 0) {
				//System.out.println("result "+b);
				return b;
			}
			a = a%b;
		}
		//System.out.println("result "+a);

		return a;
	}

}

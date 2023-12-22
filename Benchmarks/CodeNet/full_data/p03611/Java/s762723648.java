import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


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
		

		
		String[] tmpArray = br.readLine().split(" ");
		
		int[] input = new int[n];
		int[] index = new int[100001];
		Arrays.fill(index, -1);
		
		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
		}
		
		Arrays.sort(input);
		if(n == 1){
			System.out.println(1);
			return;
		}		
		if(n == 2){
			if(input[1] - input[0] <= 2){
				System.out.println(2);
			}
			else {
				System.out.println(1);
			}
			return;
		}
		
		for(int i = 0; i < input.length ; i++){
			if(index[input[i]] == -1){
				index[input[i]] = i;
			}
		}
		
		for(int i = 1; i < index.length; i++){
			if(index[i] == -1 && index[i - 1] >= 0){
				index[i] = index[i - 1];
			}
		}
		
		int max = 0;
		for(int i = 1; i < index.length - 2 ; i++){
			if(index[i + 2] - index[i] + 1 > max){
				max = index[i + 2] - index[i] + 1;
			}
		}
		
		System.out.println(max);
	}

}

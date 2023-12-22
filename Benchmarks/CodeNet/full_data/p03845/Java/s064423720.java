import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		String[] inputStr = br.readLine().split(" ");
		int[] input = new int[inputStr.length];

		for(int i=0; i<inputStr.length;i++){
			input[i] = Integer.parseInt(inputStr[i]);
		}
		int n = input[0];
		int m = input[n+1];
		int sum =0;
		int num_original=0;
		for(int i =0; i<m; i++){
			int idx = input[ n + 2 + 2*i ];
			num_original = input[idx];
			input[idx] = input[ n + 3 + 2*i];
			for(int j = 1; j < n + 1; j++){
				sum += input[j];
			}
			System.out.println(sum);
			sum=0;
			input[idx]=num_original;
		}
	}
}
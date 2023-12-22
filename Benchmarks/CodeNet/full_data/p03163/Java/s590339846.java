import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Knapsack1 {
//	3 8
//	3 30
//	4 50
//	5 60
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] numbersStr = br.readLine().split(" ");
		int n = Integer.parseInt(numbersStr[0]);
		int w = Integer.parseInt(numbersStr[1]);
		int[] weights = new int[n];
		int[] values = new int[n];
		for(int i = 0; i < n; i++){
			String[] ping = br.readLine().split(" ");
			weights[i] = Integer.parseInt(ping[0]);
			values[i] = Integer.parseInt(ping[1]);			
		}
		System.out.println(solver(weights, values, w, 0));
	}

	private static long solver(int[] weights, int[] values, int W, int index) {
		if(W < 0){
			return Integer.MIN_VALUE;
		}
		if(W==0){
			return 0;
		}
		if(index == weights.length){
			return 0;
		}
		
		long ans = 0;
		
		ans = Math.max(solver(weights, values, W-weights[index], index+1) + values[index], ans);
		ans = Math.max(solver(weights, values, W, index+1) , ans);
		return ans;
	}

}

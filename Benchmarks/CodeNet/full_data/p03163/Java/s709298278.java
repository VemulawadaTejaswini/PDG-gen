import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] S = br.readLine().split(" ");
		int N = Integer.parseInt(S[0]);
		int W = Integer.parseInt(S[1]);
		int[] weight = new int[N+1];
		int[] value = new int[N+1];
		
		
		for(int i = 1; i <= N ; i++) {
			S = br.readLine().split(" ");
			weight[i] = Integer.parseInt(S[0]);
			value[i] = Integer.parseInt(S[1]);
		}
		
		long[][] cache = new long[N+1][W+1];
		
		for(int w = 1; w <= W ; w++) {
			for(int i = 1; i <= N ; i++) {
				if(w >= weight[i]) {
					long remainingValue = 0;
					int remainingW = w - weight[i];
					if(remainingW != 0) {
						for(int j = 1; j <= N ; j++) {
							if(i == j) continue;
							remainingValue = Math.max(remainingValue, cache[j][remainingW]);
						}
					}
					cache[i][w] = value[i] + remainingValue;
				}
			}
		}
		
		long result = 0;
		for(int i = 1; i <= N ; i++) {
			result = Math.max(result, cache[i][W]);
		}
		
		System.out.println(result);
	}
}

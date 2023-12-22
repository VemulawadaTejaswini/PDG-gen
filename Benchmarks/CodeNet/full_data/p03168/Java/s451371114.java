import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double[] P = new double[N+1];
		
		String[] S = br.readLine().split(" ");
		for(int i = 0; i < N ; i++) {
			P[i+1] = Double.parseDouble(S[i]);
		}
		
		int totalH = N/2 + 1;
		int totalT = N/2;
		
		double[][] cache = new double[N+1][totalT+1];
		for(int i =  0 ; i <= totalH; i++) {
			Arrays.fill(cache[i], -1);
		}
		
		double result = 0;
		while(totalT >= 0) {
			
			result += calculateProb(1, totalH, totalT, P, cache);
			totalT--;
			totalH++;
		}
		
		System.out.println(result);
		
	}
	
	public static double calculateProb(int start,  int H, int T, double[] P, double[][] cache) {
		
		if(H == 0 && T == 0) {
			return 1;
		}
		
		if(cache[H][T] != -1.0) {
			return cache[H][T];
		}
		
		if(H == 0) {
			cache[H][T] = (1.0 - P[start]) * calculateProb(start + 1, H, T-1, P, cache);
		} else if( T == 0) {
			cache[H][T] = P[start] * calculateProb(start + 1, H-1, T, P, cache);
		} else {
			cache[H][T] = (P[start] * calculateProb(start + 1, H-1, T, P, cache)) + ((1.0 - P[start]) * calculateProb(start + 1, H, T-1, P, cache));
		}
		
		return cache[H][T];
	}
}

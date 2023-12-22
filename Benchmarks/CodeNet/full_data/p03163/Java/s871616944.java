import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		String[] first = input.split(" ");
		int n = Integer.parseInt(first[0]);
		int amount = Integer.parseInt(first[1]);
		
		int[][] WV = new int[n][2];
		for(int i = 0; i < n; i++) {
			input = in.readLine();
			first = input.split(" ");
			int weight = Integer.parseInt(first[0]);
			int value = Integer.parseInt(first[1]);
			WV[i][0] = weight;
			WV[i][1] = value;
		}
		//System.out.println(Arrays.deepToString(WV));
		System.out.println(knapSack(WV,amount));
	}
	
	public static long knapSack(int[][] WV, int amount) {
		int rows = WV.length + 1;
		long[][] DP = new long[rows][amount + 1];
		for(int i = 1; i < rows; i++) {
			for(int j = 1; j <= amount; j++) {
				if(j < WV[i-1][0]) DP[i][j] = DP[i-1][j];
				else DP[i][j] = Math.max(DP[i-1][j], DP[i-1][j-WV[i-1][0]] + WV[i-1][1]);
			}
		}
		//System.out.println(Arrays.deepToString(DP));
		return DP[rows-1][amount];
	}
}

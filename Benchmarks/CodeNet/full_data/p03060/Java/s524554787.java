import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int n = in.nextInt();
		
		int[] value = new int[n];
		for(int i = 0; i < n; i++) {
			value[i] = in.nextInt();
		}
		
		int[] cost = new int[n];
		for(int j = 0; j < n; j++) {
			cost[j] = in.nextInt();
		}

		int result = solve(n, value, cost);
		System.out.println(result);

		in.close();

	}
	
	public static int solve(int n, int[] value, int[] cost) {
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			if((value[i] - cost[i]) > 0) {
				result += value[i] - cost[i];
			}
		}
		
		return result;
	}

}
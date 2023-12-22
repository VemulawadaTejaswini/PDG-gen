

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[][] games = new int[n][n - 1];
		
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			
			for(int j = 0; j < n - 1; j++){
				games[i][j] = Integer.parseInt(tmpArray[j]) - 1;
			}
		}
		
		int current[] = new int[n];
		boolean done[] = new boolean[n];
		int count = 1;
		while(true){
//			System.out.println("date "+count);
			Arrays.fill(done, false);
			
			boolean matched = false;
			for(int i = 0; i < n ; i++){
				if(done[i] || current[i] >= n - 1){
					continue;
				}
				
				int target = games[i][current[i]];

				
				if(!done[target] && current[target] < n - 1 && games[target][current[target]] == i){
//					System.out.println(i + " vs "+target);
					done[i] = true;
					done[target] = true;
					current[i]++;
					current[target]++;
					matched = true;
				}
			}
			if(!matched){
				System.out.println(-1);
				return;
			}
			
			boolean finished = true;
			for(int i = 0; i < n; i++){
				if(current[i] < n - 1){
					finished = false;
					break;
				}
			}
			
			if(finished){
				break;
			}
			
			count++;
		}
		
		System.out.println(count);
	}

}

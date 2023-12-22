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

		String input = br.readLine();
		String[] tmpArray = input.split(" ");
		int h = Integer.parseInt(tmpArray[0]);
		int w = Integer.parseInt(tmpArray[1]);

		int[][] costs = new int[10][10];

		for(int i = 0; i <= 9 ; i++){
			tmpArray = br.readLine().split(" ");
			for(int j = 0; j <= 9; j++){
				costs[i][j] = Integer.parseInt(tmpArray[j]);
			}
		}

		int[][] numbers = new int[h][w];
		for(int i = 0; i < h; i++){
			tmpArray = br.readLine().split(" ");
			for(int j = 0; j < w; j++){
				numbers[i][j] = Integer.parseInt(tmpArray[j]);
			}
		}
		
		int[][] minCosts = allPairsShortest(costs);
		
		long totalCost = 0;
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(numbers[i][j] == -1 || numbers[i][j] == 0){
					continue;
				}
				
				else {
					totalCost += minCosts[numbers[i][j]][1];
				}
			}
		}
		
		System.out.println(totalCost);

	}

	static int[][] allPairsShortest(int[][] graph){
		int n = graph[0].length;
		int[][] dist = new int[n][n];
		
		for(int u = 0; u < n; u++){
			Arrays.fill(dist[u], Integer.MAX_VALUE);
			dist[u][u] = 0;
			
			for(int v = 0; v < n; v++){
				if(u != v){
					dist[u][v] = graph[u][v];
				}
			}
		}
		
		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				if(dist[i][k] == Integer.MAX_VALUE){
					continue;
				}
				
				for(int j = 0; j < n; j++){
					long newLen = dist[i][k];
					newLen += dist[k][j];
					
					if(newLen < dist[i][j]){
						dist[i][j] = (int)newLen;
					}
				}
			}
		}
		
		return dist;
	}
	
}

import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		   
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			int Q = scanner.nextInt();
			
			int[][] train = new int[2][M];
			int[][] query = new int[2][Q];
			int[] counter = new int[Q];
			for(int i = 0; i < M; i++) 
			{
				train[0][i] = scanner.nextInt();
				train[1][i] = scanner.nextInt();
			}
			for(int i = 0; i < Q; i++) 
			{
				query[0][i] = scanner.nextInt();
				query[1][i] = scanner.nextInt();
			}
			
			for(int i = 0; i < M;i++)
			{
				for(int j = 0; j < Q; j++) 
				{
					if(query[0][j] <= train[0][i] 
							&& train[1][i] <= query[1][j]) 
					{
						counter[j]++;
					}
				}
			}
			
			for(int i = 0; i < Q; i++) 
			{
				System.out.println(counter[i]);
			}
			
		    scanner.close(); }
		  }
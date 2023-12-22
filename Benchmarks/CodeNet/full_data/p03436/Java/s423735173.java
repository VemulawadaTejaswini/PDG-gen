import java.util.LinkedList;
import java.util.Scanner;

import javafx.util.Pair;

public class Main {
		public static int boardBfs(char[][] a)
		{
			LinkedList<Pair> q = new LinkedList<Pair>();
			boolean[][] visited = new boolean[a.length][a[0].length];
			Pair[][] prev = new Pair [a.length][a[0].length];
			q.add(new Pair(0,0));
			visited[0][0]=true;
			int[] row = {0,0,1,-1};
			int[] col = {-1,1,0,0};
			
			while(!q.isEmpty())
			{
				Pair p = q.pop();
				int n=(int) p.getKey();
				int m=(int) p.getValue();
				
				if(n==a.length-1 && m==a[0].length-1)
				{
					//finish the bfs
					int count = 0;
					Pair pair = prev[n][m];
					n=(int)pair.getKey();
					m=(int)pair.getValue();
					while(n!=0 || m!=0)
					{
						a[n][m]='#';
					    pair = prev[n][m];
						n = (int)pair.getKey();
						m = (int) pair.getValue();
					}
					//count 
					for(int i=0;i<a.length;i++)
					{
						for(int j=0;j<a[0].length;j++)
						{
							if(a[i][j]=='.')
								count++;
						}
					}
					return count-2;
				}
				for(int i=0;i<row.length;i++)
				{
					if(n+row[i]>=0&&n+row[i]<a.length&&m+col[i]>=0&&m+col[i]<a[0].length&&
							a[n+row[i]][m+col[i]]=='.'&& !visited[n+row[i]][m+col[i]])
					{
						//add to bfs 
						visited[n+row[i]][m+col[i]]=true;
						prev[n+row[i]][m+col[i]]=p;
						q.add(new Pair(n+row[i],m+col[i]));
					}
				}			
			}
			
			return -1;
		}
		
		public static void main(String[] args){
			
			Scanner s = new Scanner(System.in);
			int n=s.nextInt();
			int m=s.nextInt();
			char[][] a = new char[n][m];
			
			for (int i = 0; i < a.length; i++) {
				String str = s.next();
				for (int j = 0; j < a[0].length; j++) 
					a[i][j]=str.charAt(j);
			}
			System.out.println(boardBfs(a));
					
			s.close();
		}		
}
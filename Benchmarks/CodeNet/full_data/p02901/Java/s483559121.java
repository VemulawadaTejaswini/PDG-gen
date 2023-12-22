import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    
    static boolean visited[] = new boolean[100];
    
    public static boolean check(boolean visited[],int n) {
    	for(int i=0;i<n;i++) {
    		if(!visited[i])
    			return false;
    	}
    	return true;
    }
	public static int min(int a[][],int cost[],int index,boolean visited[],int n) {
		
		if(index==a.length) {
			return 1000000007;
		}
		if(check(visited,n)) {
			return 0;
		}
		
		for(int i=0;i<a[index].length;i++) {
			visited[a[index][i]]=true;
		}
		int min1 = min(a,cost,index+1,visited,n)+cost[index];
		for(int i=0;i<a[index].length;i++) {
			visited[a[index][i]]=false;
		}
		
		int min2 = min(a,cost,index+1,visited,n);
		
		return Math.min(min1, min2);
		
	}
	public static void main (String[] args) 
	{
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int m = s.nextInt();
			int a[][] = new int[m][];
			int cost[] = new int[m];
			
			for(int i=0;i<m;i++) {
				cost[i] = s.nextInt();
				int size = s.nextInt();
				a[i] = new int[size];
				for(int j=0;j<size;j++) {
					a[i][j]=s.nextInt()-1;
				}
			}
			int ans  = min(a,cost,0,visited,n);
			
			if(ans>=1000000007) {
				System.out.println(-1);
			}
			else {
				System.out.println(ans);
			}
			
	}
}

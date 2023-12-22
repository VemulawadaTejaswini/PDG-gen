
import java.util.*;
import java.math.*;

 class Main {
     static boolean[][] graph = new boolean[8][8];

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long Nw= N;
        long[] yaku=new long[100000];
        int k=0;
        long root = (long) Math.pow(N,1.0/2.0)+1;
        
        for(long i=1;i<root;i++) {
        	if(Nw%i==0) {
        		yaku[k]=i;
//                System.out.println(i);
        		k++;
        	}
        }
//        System.out.println(Nw);
//        System.out.println("k="+k);
        long ans=999;
        for(int i=k-1;i>=0;i--) {
            long A=yaku[i];
            long B=N/yaku[i];
            long result=Math.max(A, B);
//          System.out.println("A=" + A);
//          System.out.println("B=" + B);
            if (String.valueOf(result).length()<ans)ans=String.valueOf(result).length();
        }
        System.out.println(ans);
     }   
    static int dfs(int first, int max, boolean[] visited) {
    	int ret = 0;
    	boolean all_visited = true;
    	for(int i=0;i<max;i++) {
    		if(visited[i]==false) {
    			all_visited=false;    			
    		}
    	}
    	if (all_visited) {
    		return 1;
    	}
    	
    	for(int i=0;i<max;i++) {
    		if(graph[first][i]==false) {
    			continue;
    		}
    		if(visited[i]==true) {
    			continue;
    		}
    		visited[i]=true;
			ret += dfs(i,max,visited);
			visited[i] = false;
    	}
    	return ret;
    }
}
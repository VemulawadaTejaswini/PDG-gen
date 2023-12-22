import java.util.*;
 
public class Main{
	static int ans=0;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] route = new int[m][2];
		boolean[] used = new boolean[n];
		used[0] = true;

		for(int i=0; i<m; i++){
			route[i][0] = sc.nextInt();
			route[i][1] = sc.nextInt();
		}

		for(int i=0; i<m; i++){
			if(route[i][0] == 1){
				dfs( route, route[i][1], used );
			}
		}

		System.out.println(ans);
		return;
	}

	public static void dfs( int[][] route, int start, boolean[] used ){
		ArrayDeque stack = new ArrayDeque();
		boolean check = true;
		used[start-1] = true;

		for(int i=0; i<used.length; i++){
			check = check & used[i];
		}
		if(check){
			ans++;
		}else{
			for(int i=0; i<route.length; i++){
				if(route[i][0] == start && !used[ route[i][1] -1 ]){
					dfs( route, route[i][1], used );
				}
			}
		}
		return;
	}
}
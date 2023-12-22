//幅優先探索　最短でいったぬる
//https://qiita.com/drken/items/996d80bcae64649a6580
import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;
public class Main {
	static int N ;
	static int M;
	static int ans = 0;
	static boolean map[][];
	static int flag[];
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		flag = new int[N+1];
		map = new boolean[N+1][N+1];
		for(int i=0; i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = map[b][a] = true;
		}
		flag[1] = 1;
		solve(1);
		System.out.println(ans);
	}
	static  void solve(int x){
		if(TRUE()) {
			ans++;
			return;
		}else {
			for(int i = 1; i<=N;i++) {
				if(map[x][i] && flag[i]==0) {
					flag[i] = 1;
					solve(i);
					flag[i] = 0;
				}
			
			}
		}
		return ;
	}
	static boolean TRUE() {
		int count = 0;
		for(int i = 1; i<= N; i++) {
			if(flag[i] == 1)count++;
		}
		if(count == N) {
			return true;
		}
		return false;
		
	}
	
}
	


import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int h , w;
	static Queue <Integer>que;
	static boolean jdg;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 h = Integer.parseInt(sc.next());
		 w = Integer.parseInt(sc.next());
		
		boolean[][]grid = new boolean[h][w];
		int []alp = new int [26];
		que = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i = 0 ; i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ; j++) {
				int p = s.charAt(j) - 'a';
				alp[p]++;
			}
		}
		
		for(int num : alp) {
			que.add(num);
		}
		
		jdg = true;
		for(int i = 0 ; i < h ;i++) {
			for(int j = 0 ; j < w ; j++) {
				SearchGrid(i,j,grid);
			}
		}
		
		if(jdg) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
	static void SearchGrid(int i , int j , boolean [][]grid) {
		if(grid[i][j]) {
			return;
		}
		
		int num = 4;
		int []dy = {i,h-1-i,h-i-1,i};
		int []dx = {j,j,w-1-j,w-1-j};
		
		for(int x = 0 ; x < 4 ;x++) {
			if(!grid[dy[x]][dx[x]]) {
				grid[dy[x]][dx[x]] = true;
			}
			else {
				num--;
			}
		}
		
		int temp = que.poll();
		if(temp < num) {
			jdg = false;
			return;
		}
			que.add(temp-num);
			return;
		
	}

}

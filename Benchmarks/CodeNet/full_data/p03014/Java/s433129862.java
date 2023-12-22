import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();
		int INF = Integer.MAX_VALUE;
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		char[][] map = new char[H][W];
		for(int i=0; i<H; i++){
			map[i] = sc.next().toCharArray();
		}
		
		int[][] dpup = new int[H][W];
		int[][] dpdown = new int[H][W];
		int[][] dpleft = new int[H][W];
		int[][] dpright = new int[H][W];
		int[][] dpans = new int[H][W];
		
		if(H==1 && W==1 && map[0][0] == '.')ans=1;
		
		for(int h=0; h<H; h++){
			for(int w=0; w<W; w++){
				if(h==0 || map[h][w] == '#'){
					dpup[h][w] = 0;
					continue;
				}
				if(map[h-1][w] == '#'){
					dpup[h][w] = 0;
				}else{
					dpup[h][w] = dpup[h-1][w]+1;
				}
			}
		}
		
		for(int h=H-1; h>=0; h--){
			for(int w=0; w<W; w++){
				if(h==H-1 || map[h][w] == '#'){
					dpdown[h][w] = 0;
					continue;
				}
				if(map[h+1][w] == '#'){
					dpdown[h][w] = 0;
				}else{
					dpdown[h][w] = dpdown[h+1][w]+1;
				}
			}
		}
		
		for(int h=0; h<H; h++){
			for(int w=0; w<W; w++){
				if(w==0 || map[h][w] == '#'){
					dpleft[h][w] = 0;
					continue;
				}
				if(map[h][w-1] == '#'){
					dpleft[h][w] = 0;
				}else{
					dpleft[h][w] = dpleft[h][w-1]+1;
				}
			}
		}
		
		for(int h=0; h<H; h++){
			for(int w=W-1; w>=0; w--){
				if(w==W-1 || map[h][w] == '#'){
					dpright[h][w] = 0;
					continue;
				}
				if(map[h][w+1] == '#'){
					dpright[h][w] = 0;
				}else{
					dpright[h][w] = dpright[h][w+1]+1;
				}
			}
		}
		

		//ans
		
		for(int h=0; h<H; h++){
			for(int w=0; w<W; w++){
				dpans[h][w] = dpup[h][w]+dpdown[h][w]+dpleft[h][w]+dpright[h][w];
				if(dpans[h][w]>0)dpans[h][w] += 1;
				ans = Math.max(ans, dpans[h][w]);
			}
		}
		

		
		
		System.out.println(ans);
		
	}
	
	
}


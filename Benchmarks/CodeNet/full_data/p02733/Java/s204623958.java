import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc159_e();
	}
  
  	public static void solve_abc159_e(){

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();

		char[][] chocolateMap = new char[H][W];

		for(int h=0;h<H;h++){
				chocolateMap[h] = sc.next().toCharArray();
		}

		int ans = Integer.MAX_VALUE;
		boolean[] hLine = new boolean[H];
		int numHLine = 0;

		//divide width
		ans = solve_abc159_e_bfs(0, H, W, K, chocolateMap, ans, hLine, numHLine);


		//ans = min line count
		System.out.println(ans);

		sc.close();

	}

	public static int solve_abc159_e_bfs(int h, final int H, final int W, final int K, final char[][] cmap, int ans, boolean[] hLine, int numHLine){

		if(h == H-1){
			int numWLine = solve_abc159_e_width(numHLine, hLine, H, W, K, cmap);
			//System.out.println("ans:" + ans + "\t numHline::" + numHLine + "\t numWLine:" + numWLine);
			
			if(numWLine != Integer.MAX_VALUE)	ans = Math.min(ans, numHLine + numWLine);
		}
		else{
			
			//hLine[h] = true;
			//solve_abc159_e_bfs(h+1, H, ans, hLine)
			hLine[h] = true;
			numHLine += 1;
			ans = solve_abc159_e_bfs(h+1, H, W, K, cmap, ans, hLine, numHLine);

			//hLine[h] = false;
			//solve_abc159_e_bfs(h+1, H, ans, hLine)
			hLine[h] = false;
			numHLine -= 1;
			ans = solve_abc159_e_bfs(h+1, H, W, K, cmap, ans, hLine, numHLine);
			
		}
		return ans;
	}

	public static int solve_abc159_e_width(int numHLine, boolean[] hLine, int H, int W, int K, char[][] cmap){

		int sizeHmap= numHLine + 1;
		int[][] countWC = new int[sizeHmap][W];
		int[] tmpCountWC = new int[sizeHmap];
		boolean addLine = false;
		int countLine = 0;

		int[] idxStart_ = new int[sizeHmap];
		int[] idxEnd_ = new int[sizeHmap];

		int idxHmap_ = 0;
		boolean negative = false;
		
		idxStart_[0] = 0;
		idxEnd_[sizeHmap-1] = H - 1;
		
		for(int h=0;h<H;h++){
			if(hLine[h]){
				idxEnd_[idxHmap_] = h;
				idxStart_[idxHmap_+1] = h + 1;
				idxHmap_++;
			}
		}
		
		/*
		System.out.println("------------------------");
		for(int i=0;i<sizeHmap;i++){
			System.out.println("Start:"+idxStart_[i]+"\t End:"+idxEnd_[i]);
		}
		*/
		
		int idxWPrv = -1;

		for(int w=0;w<W;w++){
			addLine = false;

//			for(Map.Entry<Integer, Integer> ehmap: hmap.entrySet()){
			for(int idxHmap=0;idxHmap<sizeHmap;idxHmap++){

				int idxStart = idxStart_[idxHmap];
				int idxEnd = idxEnd_[idxHmap];

				for(int h=idxStart;h<=idxEnd;h++){
					if(cmap[h][w] == '1') countWC[idxHmap][w]++;
				}
				
//				System.out.println("tmpCountWC:"+ tmpCountWC[idxHmap] + "\t countWC:" + countWC[idxHmap][w]);

				if(tmpCountWC[idxHmap] +  countWC[idxHmap][w] > K && !addLine){
					countLine++;
					addLine = true;
					if(w - idxWPrv == 0) negative = true;
					idxWPrv = w;
				}
				//idxHmap++;
			}
			
			for(int i=0;i<sizeHmap;i++){
				if(addLine){
					tmpCountWC[i] =  countWC[i][w];
				}
				else{
					tmpCountWC[i] +=  countWC[i][w];
				}
			}
		}
		
		if(negative) countLine = Integer.MAX_VALUE;
//		System.out.println("countLine:"+countLine);

		return countLine;
	}
}
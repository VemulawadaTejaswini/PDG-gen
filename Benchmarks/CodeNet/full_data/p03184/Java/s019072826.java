import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { //Correct code; just too slow
		Scanner input = new Scanner(System.in);
		long mod = (long)(1e9+7);
		int H = input.nextInt();
		int W = input.nextInt();
		int N = input.nextInt();
		ArrayList<Integer>[] wall = new ArrayList[100001];//ith index = row of grid; components = columns
		for (int i = 1; i <= 100000; i++) {
			ArrayList<Integer> x = new ArrayList<Integer>();
			wall[i] = x;
		}
		for (int i = 0; i < N; i++) {
			wall[input.nextInt()].add(input.nextInt());
		}
		Stack<long[]> curLevel = new Stack<long[]>();
		long[] firstRow = new long[W+1];
		for (int i = 1; i <= W; i++) {
			boolean bad = false;
			for (int check = 0; check < wall[1].size(); check++) {
				if (wall[1].get(check)==i) {
					bad = true;
					break;
				} 
			}
			if (bad) break;
			else firstRow[i]=1;
		}
		curLevel.push(firstRow);
		for (int r = 2; r <= H; r++) {
			long[] prev = curLevel.pop();
			long[] cur = new long[W+1];
			for (int c = 1; c<=W; c++) {
				boolean bad = false;
				for (int check = 0; check < wall[r].size(); check++) {
					if (wall[r].get(check)==c) {
						bad=true;
						break;
					}
				}
				if (!bad) cur[c]=(cur[c-1]+prev[c])%mod;
			}
			curLevel.push(cur);
		}
		long[] finalRow = curLevel.pop();
		System.out.println(finalRow[W]);
	}
}
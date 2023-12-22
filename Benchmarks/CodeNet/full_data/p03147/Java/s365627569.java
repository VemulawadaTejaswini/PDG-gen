import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public int solve(int N, int[] hs) {
		return getTimes(hs, 0, 0, N-1);
	}
	
	public int getTimes(int[] hs, int height, int start, int end) {
		if (start > end) {
			return 0;
		} else if (start == end) {
			return hs[start] - height;
		}
		
		List<Integer> list = new LinkedList<Integer>();
		int min = Integer.MAX_VALUE;
		
		for (int i=start; i<=end; i++) {
			if (hs[i] < min) {
				min = hs[i];
				list.clear();
				list.add(i);
			} else if (hs[i] == min) {
				list.add(i);
			}
		}

		int result = min - height;	// start~endの範囲の一番低い高さまで水を入れる
		
		int nextIndex = start;
		for (int x : list) {
			// minの高さで区切られた領域の回数を数える
			result += getTimes(hs, min, nextIndex, x-1);
			nextIndex = x+1;
		}
		// 最後のminのIndex～endの領域も忘れない
		result += getTimes(hs, min, nextIndex, end);

		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] hs = new int[N];
		
		for (int i=0; i<N; i++) {
			hs[i] = in.nextInt();
		}
		in.close();
		
		Main main = new Main();
		int result = main.solve(N, hs);
		
		System.out.println(result);
	}
}
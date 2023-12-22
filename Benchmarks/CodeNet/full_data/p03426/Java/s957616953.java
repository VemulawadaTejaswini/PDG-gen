import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static Map<Integer, Entry<Integer, Integer>> map = new HashMap<>();
	static int[][] lrGrid;
	static int d;
	static int[][] memoGrid;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		d = sc.nextInt();
		int[][] aGrid = new int[h][w];
		for(int i = 0; i < h;i++){
			for(int  j = 0; j < w; j++){
				map.put(sc.nextInt(), new SimpleEntry<>(i, j));
			}
		}
		int q = sc.nextInt();
		lrGrid = new int[q][2];
		for(int i = 0; i < q; i++){
			lrGrid[i][0] = sc.nextInt();
			lrGrid[i][1] = sc.nextInt();
		}
		memoGrid = new int[h * w][h * w];
		for(int i = 0; i <memoGrid.length;i++){
			Arrays.fill(memoGrid[i], 0);
		}
		int mp = 0;
		for(int i = 0; i< q;i++){
			System.out.println(move(i, lrGrid[i][0]));
		}
	}

	public static int move(int q, int start){
		int mp = 0;
		if(lrGrid[q][1] == start){
			return 0;
		}else if(memoGrid[start][start+d] != 0){
			return memoGrid[start][start+d];
		}

		Entry<Integer, Integer> e1 = map.get(start);
		Entry<Integer, Integer> e2 = map.get(start + d);
		mp = Math.abs(e1.getKey() - e2.getKey()) + Math.abs(e1.getValue() - e2.getValue());
		memoGrid[start][start+d] = mp;
		mp += move(q, start+d);
		return mp;
	}

}

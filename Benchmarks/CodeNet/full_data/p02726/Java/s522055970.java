
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main implements Runnable { //クラス名はMain1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMainD3 sc = new FastScannerMainD3(System.in);

		try {
			//String S = sc.nextLine().trim();
			// 5 2 4
			int N = sc.nextInt();
			int X = sc.nextInt();
			int Y = sc.nextInt();			

			//隣接リストの作成
			//HashMap<Integer, NextList> hm = new HashMap<Integer, NextList>();
			NextList[] arr = new NextList[N];
			for (int i = 0; i < N; i++) {
				NextList nextList = new NextList();
				if (i == 0) {
					nextList.neighbours.add(i + 1);
				} else if (i == N - 1) {
					nextList.neighbours.add(i - 1);
				} else {
					nextList.neighbours.add(i + 1);
					nextList.neighbours.add(i - 1);
				}
				//hm.put(i, nextList);
				arr[i] = nextList;
			}

			//hm.get(X - 1).neighbours.add(Y - 1);
			//hm.get(Y - 1).neighbours.add(X - 1);

			arr[X - 1].neighbours.add(Y - 1);
			arr[Y - 1].neighbours.add(X - 1);

			int[] ans = new int[N];
			Bfs bfs=new Bfs(N);
			int[] each;
			for (int i = 0; i < N; i++) {
				each =bfs.bfsgraph(i,arr,N);
				for (int j = 0; j < each.length; j++) {
					ans[each[j]]++;
				}
			}

			for (int i = 1; i < N; i++) {
				System.out.println(ans[i]/2);
			}			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Bfs {
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	boolean[] visit;
	int[] distance;

	/**
	 * 
	 * @param N　頂点数
	 */
	public Bfs(int N) {
		visit = new boolean[N];
		distance = new int[N];
	}


	public int[] bfsgraph(int start, NextList[] nl,int N) {
		
		pq.offer(start);
		Arrays.fill(visit,false);
		visit[start] = true;
		
		Arrays.fill(distance,Integer.MAX_VALUE);
		distance[start] = 0;

		while(pq.size()>0){
			int loc = pq.poll();
			for(int i: nl[loc].neighbours){
				if(!visit[i]){
					pq.offer(i);
					visit[i] = true;
					distance[i] = distance[loc]+1;
				}else{
					//さらに短い距離が見つかったら再度調査
					if(distance[i] > distance[loc]+1){
						pq.offer(i);
						distance[i] = distance[loc]+1;
					}
				}
			}
		}
		return distance;
	}
}

class NextList {
	TreeSet<Integer> neighbours = new TreeSet<>();
}

//高速なScanner
class FastScannerMainD3 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainD3(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}

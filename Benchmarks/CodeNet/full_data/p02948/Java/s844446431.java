/* بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ */
//codeforces_279B
//o(n * log(n))
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.Math.*;
import java.math.*;

public class Main{

	static PrintWriter go = new PrintWriter(System.out);
	
	public static void main(String args[]) throws IOException,FileNotFoundException {
		BufferedReader gi = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		int[] l = parseArray(gi);
		int n = l[0];
		int m = l[1];
		int[][] jobs = new int[n][];
		for ( int k = 0; k < n; k++ ){
			jobs[k] = parseArray(gi);
		}
		Arrays.sort(jobs, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		int ans = 0;
		int cur = 0;
		Queue<pair> q = new PriorityQueue<>();
		for ( int k = 1; k <= m; k++ ){
			while (cur < n && jobs[cur][0] <= k) {
				q.add(new pair(jobs[cur][1], cur));
				cur++;
			}
			if (!q.isEmpty()) ans += q.poll().x;
		}
		go.println(ans);
		go.close();
	}

	static class pair implements Comparable {
		public int x, y;
		pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int compareTo(Object p) {
			return ((pair)p).x - this.x;
		}
	}

	static int[] parseArray(BufferedReader gi) throws IOException{
		String[] line = gi.readLine().split(" ");
		int[] rez = new int[line.length];
		for ( int k = 0; k < line.length; k++){
			rez[k] =  Integer.parseInt(line[k]);
		}
		return rez;
	}

}


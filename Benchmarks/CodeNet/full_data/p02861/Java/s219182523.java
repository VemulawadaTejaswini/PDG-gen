//--- pC ---//
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Reader reader;
	public Solution () {
		reader = new Reader();
		while (reader.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		int n = reader.ni();
		int[][] dis = new int[n][2];
		for (int i=0; i<n; i++) {
			dis[i][0] = reader.ni();
			dis[i][1] = reader.ni();
		}

		int[] arr = new int[n];
		for (int i=0; i<n; i++)arr[i] = i;

		int u = 0;

		double res = 0.0;
		do {
			u++;
			for (int i=0;i<n-1;i++) {
				int a = arr[i], b = arr[i+1];
				long dx = dis[b][0] - dis[a][0];
				long dy = dis[b][1] - dis[a][1];
				double t = Math.sqrt(dx*dx + dy*dy);
				// res +=  (((t * (n-1) ) * (n-1)) / fact);
				res += t;
				// System.out.print(array[i]);
			}
			// System.out.println();
		} while (nextPermutation(arr));

		// long fact = 1;
		// for (long i=2; i<=n; i++) {
		// 	fact *= i;
		// }
		//
		// double total_dist = 0.0;
		// double res = 0.0;
		// for (int i=0; i<n; i++) {
		// 	for (int j=i+1; j<n; j++) {
		// 		long dx = dis[j][0] - dis[i][0];
		// 		long dy = dis[j][1] - dis[i][1];
		// 		// System.out.println(dx + " " + dy);
		// 		double t = Math.sqrt(dx*dx + dy*dy);
		// 		// res +=  (((t * (n-1) ) * (n-1)) / fact);
		// 		res += t;
		// 		// System.out.println(t);
		// 	}
		// }

		res /= u;
		// total_dist *= 2;
		// System.out.println("total = " + total_dist);

		// long fact = 1;
		// for (long i=2; i<=n; i++) {
		// 	fact *= i;
		// }

		// double res = 0.0;

		System.out.println(res);

		return;
	}

	public static boolean nextPermutation(int[] array) {
		if (array.length<=1) return false;
		int i = array.length-2;
		for(;i>=0&&array[i]>array[i+1];i--);
		if(i==-1)return false;
		int k =i+1;
		for(;k<array.length&&array[k]>array[i];k++);
		swap(array,i,k-1);
		Arrays.sort(array,i+1,array.length);
		return true;
	}

	public static void swap(int[] array, int i, int j) {
		int t = array[i];
		array[i] = array[j];
		array[j] =t;

	}
}

class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			if (!st.hasMoreTokens() && !br.ready()) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public int ni() {return Integer.parseInt(this.next());}
	public String ns() {return this.next();}
}

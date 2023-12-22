import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() {
			while(st==null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
					
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	public static void main(String[] args) {
		FastReader ob =  new FastReader();
		int arr[] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ob.nextInt();
		}
		Arrays.parallelSort(arr);
		if(arr[0]==arr[2]) {
			System.out.println(1);
		}
		if(arr[0]==arr[1] || arr[1]==arr[2]) {
			System.out.println(2);
		}
		else {
			System.out.println(3);
		}
		
		
	}

}

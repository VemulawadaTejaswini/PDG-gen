import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		InputReader r = new InputReader(System.in);
		int n = r.nextInt();
		int[] arr = new int[n];
		long res = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt();
			
		}
		res+=(arr[0]/2);
		arr[0]%=2;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1]>=1){
				if(arr[i]>0){
					arr[i-1]--;
				arr[i]--;
				res++;
				}
			}
			if(arr[i]>1){
				res+=(arr[i]-1)/2;
				arr[i]=(arr[i]-1)%2;
				arr[i]++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			res+=(arr[i]/2);
		}
		System.out.println(res);

	}

	static class InputReader {
		private BufferedReader reader;
		private StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}

		public InputReader(FileReader stream) {
			reader = new BufferedReader(stream);
			tokenizer = null;
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}

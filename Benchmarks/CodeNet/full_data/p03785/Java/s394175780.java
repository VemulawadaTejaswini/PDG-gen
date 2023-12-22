import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		long c = fs.nextLong();
		long k = fs.nextLong();
		
		long[] arrivalTimeArr = fs.nextLongArr(n);
		Arrays.sort(arrivalTimeArr);
		
		int ans = 0;
		ArrayDeque<Long> passengerQue = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			long arrivalTime = arrivalTimeArr[i];
			if(!passengerQue.isEmpty()) {
				long nextAngerTime = passengerQue.peek();
				while(nextAngerTime < arrivalTime) {
					ans++;
					busArrive(passengerQue, c);
					if(passengerQue.isEmpty()) {
						nextAngerTime = Long.MAX_VALUE;
					}else {
						nextAngerTime = passengerQue.peek();
					}
				}
			}
			passengerQue.add(new Long(arrivalTime + k));
		}
		
		while(!passengerQue.isEmpty()) {
			ans++;
			busArrive(passengerQue, c);
		}
		
		System.out.println(ans);
	}
	
	public void busArrive(ArrayDeque<Long> passengerQue, long c) {
		for(long i = 0; i < c; i++) {
			if(passengerQue.isEmpty()) {
				break;
			}
			passengerQue.poll();
//			System.out.print(passengerQue.poll()+",");
		}
//		System.out.print("\n");
	}

	

	public class FastScanner {

		BufferedReader reader;
		private StringTokenizer st;

		public FastScanner() {
			st = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			if (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(reader.readLine());
			}
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			st = null;
			String readLine = null;
			readLine = reader.readLine();
			return readLine;
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArr(int n) throws NumberFormatException, IOException {
			int[] retArr = new int[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}

		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}

		public void close() throws IOException {
			reader.close();
		}
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int h = fs.nextInt();
		int w = fs.nextInt();
		int k = fs.nextInt();
		
		int[][] chocoGrid = new int[h][w];
		
		for(int i = 0; i < h; i++) {
			
			String s = fs.next();
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '1') {
					chocoGrid[i][j] = 1;
				}else {
					chocoGrid[i][j] = 0;
				}
			}
		}
		
		int colLines = 0;
		if(h != 1){
			colLines = pow(2, h-1);
		}
		
		int ans = 1_000_000_007;
		
		for(int i = 0; i < colLines; i++) {
			
			ArrayList<Integer> divideList = calcDivideList(i);
			
			int[] chocoArr = new int[divideList.size()+1];
			int[] whiteChocoArr = new int[divideList.size()+1];
			
			int tateBow = 0;
			boolean canDivide = true;
			
			for(int j = 0; j < w; j++) {
				
				int[] thisRowChocoArr = new int[divideList.size()+1];
				int[] thisRowWhiteChocoArr = new int[divideList.size()+1];
				
				int height = 0;
				for(int m = 0; m < divideList.size(); m++) {
					int divideHeight = divideList.get(m);
					while(height <= divideHeight) {
						if(chocoGrid[height][j] == 1) {
							thisRowWhiteChocoArr[m]++;
						}else {
							thisRowChocoArr[m]++;
						}
						height++;
					}
				}
				
				for(int m = height; m < h; m++) {
					
					if(chocoGrid[m][j] == 1) {
						thisRowWhiteChocoArr[divideList.size()]++;
					}else {
						thisRowChocoArr[divideList.size()]++;
					}
				}
				
				for(int m = 0; m < divideList.size() + 1; m++) {
					if(thisRowWhiteChocoArr[m] > k) {
						canDivide = false;
						break;
					}
				}
				
				if(!canDivide) {
					break;
				}
				
				boolean canAdd = true;
				for(int m = 0; m < divideList.size() + 1; m++) {
					
					if(whiteChocoArr[m] + thisRowWhiteChocoArr[m] > k) {
						canAdd = false;
						break;
					}
				}
				
				if(canAdd) {
					for(int m = 0; m < divideList.size() + 1; m++) {
						chocoArr[m] = chocoArr[m] + thisRowChocoArr[m];
						whiteChocoArr[m] = whiteChocoArr[m] + thisRowWhiteChocoArr[m];
					}
				}else {
					for(int m = 0; m < divideList.size() + 1; m++) {
						chocoArr[m] = thisRowChocoArr[m];
						whiteChocoArr[m] = thisRowWhiteChocoArr[m];
					}
					
					tateBow++;
				}
			}
			
			
			if(!canDivide) {
				continue;
			}
			
			ans = Math.min(divideList.size() + tateBow, ans);
		}
		
		
		System.out.println(ans);
	}
	
	ArrayList<Integer> calcDivideList(int val){
		
		ArrayList<Integer> retList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			if(((val >> i) & 1) == 1) {
				retList.add(i);
			}
		}
		
		return retList;
	}
	
	public int pow(int base, int n) {
		int retVal = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				retVal *= base;
			}
			n >>= 1;
			base *= base;
		}
		return retVal;
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

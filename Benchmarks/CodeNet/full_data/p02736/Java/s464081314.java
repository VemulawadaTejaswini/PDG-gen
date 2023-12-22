import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
000001000000000
00001100000000
0001010000000
001111000000
01000100000 01000101000
1100110000 0000001100 1100111100
010101000 000001010 010100010
11111100
0000010
000011
00010
0011
010
11
0

000000000001000
00000000001100
0000000001010
000000001111
00000001000
0000001100
000001010
00001111
0001000
001100
01010
1111
000
00
0


000001000001000
00001100001100
0001010001010
001111001111
01000101000
1100111100
010100010
11110011
0001010
001111
01000
1100
010
11
0



 */
public class Main {
	
	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		fs.next();
		char[] line=fs.next().toCharArray();
		int[] diffs=new int[line.length-1];
		for (int i=0; i+1<line.length; i++) diffs[i]=Math.abs(line[i+1]-line[i]);
		int[] counts=new int[3];
		for (int i:diffs) counts[i]++;
		if (counts[1]!=0) {
			for (int i=0; i<diffs.length; i++) diffs[i]=diffs[i]%2;
		}
		while (diffs.length!=1) {
			diffs=getSmaller(diffs);
		}
		System.out.println(diffs[0]);
	}
	
	static int[] getSmaller(int[] line) {
//		System.out.println("Line: "+Arrays.toString(line));
		int n=line.length;
		int pow=Integer.highestOneBit(n-1);
		int newN=n-pow;
		int[] res=new int[newN];
		for (int i=0; i<newN; i++) {
			res[i]=Math.abs(line[i]-line[i+pow]);
		}
		return res;
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");

		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) {
				a[i]=nextInt();
			}
			return a;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}
	
}

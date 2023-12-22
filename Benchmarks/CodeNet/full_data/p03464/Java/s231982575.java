import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.*;
import java.math.*;
import java.text.*; 
import java.util.*;
import java.util.regex.*;
/*
	  br = new BufferedReader(new FileReader("input.txt"));
	  pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
	  br = new BufferedReader(new InputStreamReader(System.in));
	  pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
 */

public class Main {
	private static BufferedReader br;
	private static StringTokenizer st;
	private static PrintWriter pw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		//int qq = 1;
		int qq = Integer.MAX_VALUE;
		//int qq = readInt();
		for(int casenum = 1; casenum <= qq; casenum++)	{
			int n = readInt();
			int[] l = new int[n];
			for(int i = 0; i < n; i++) {
				l[i] = readInt();
			}
			TreeSet<Long> ret = new TreeSet<Long>();
			long low = 2;
			long high = (long)1e18;
			while(low <= high) {
				long mid = (low+high)/2;
				long orig = mid;
				for(int out: l) {
					mid -= mid%out;
				}
				if(mid == 2) {
					ret.add(orig);
					break;
				}
				else if(mid > 2) {
					high = orig-1;
				}
				else {
					low = orig+1;
				}
			}
			pw.flush();
			if(ret.isEmpty()) {
				pw.println(-1);
				continue;
			}
			low = 2;
			high = (long)1e18;
			while(low != high) {
				long mid = (low+high)/2;
				long orig = mid;
				for(int out: l) {
					mid -= mid%out;
				}
				if(mid >= 2) {
					if(mid == 2)
						ret.add(orig);
					high = orig;
				}
				else {
					low = orig+1;
				}
			}
			low = 2;
			high = (long)1e18;
			while(low != high) {
				long mid = (low+high+1)/2;
				long orig = mid;
				for(int out: l) {
					mid -= mid%out;
				}
				if(mid <= 2) {
					if(mid == 2)
						ret.add(orig);
					low = orig;
				}
				else {
					high = orig-1;
				}
			}
			pw.println(ret.first() + " " + ret.last());
		}
		exitImmediately();
	}

	private static void exitImmediately() {
		pw.close();
		System.exit(0);
	}

	private static long readLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	private static double readDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	private static String nextLine() throws IOException  {
		if(!br.ready()) {
			exitImmediately();
		}
		st = null;
		return br.readLine();
	}

	private static String nextToken() throws IOException  {
		while(st == null || !st.hasMoreTokens())  {
			if(!br.ready()) {
				exitImmediately();
			}
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}
}
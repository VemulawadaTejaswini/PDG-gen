import java.util.*;
import java.io.*;

class Point implements Comparable<Point>{
	public int x;
	public int y;
	public Point(int x, int y) { this.x=x; this.y=y;}
	@Override
	public int compareTo(Point p) {
		if(this.x<p.x) return -1;
		if(this.x>p.x) return 1;
		if(this.y<p.y) return -1;
		if(this.y<p.y) return 1;
		return 0;
	}
}

public class Main{
	public static void main(String[] args) {
		FastReader r = new FastReader();
		int pairs = r.ri();
		Point[] smaller = new Point[pairs];
		Point[] bigger = new Point[pairs];
		for (int i = 0; i < pairs; i++) {
			int[] x = r.ria();
			smaller[i]=  new Point(x[0],x[1]);
		}
		for (int i = 0; i < pairs; i++) {
			int[] x = r.ria();
			bigger[i] =  new Point(x[0],x[1]);
		}
		Arrays.sort(smaller);
		Arrays.sort(bigger);
		
		int count = 0;
		int s = 0;
		int b = 0;
		while(s < pairs && b < pairs) {
			if(smaller[s].x < bigger[b].x && smaller[s].y < bigger[b].y) {
				count++;
				s++;
				b++;
			} else if(smaller[s].x > bigger[b].x){
				b++;
			} else {
				s++;
			}
		}
		print(count);		
	}

	public static void rolling(int[] arr) {
		if (arr.length < 2)
			return;
		for (int i = 1; i < arr.length; i++)
			arr[i] += arr[i - 1];
	}

	public static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

	public static void print(String s) {
		System.out.println(s);
	}

	public static void print(long s) {
		System.out.println(s);
	}

	public static void print(int s) {
		System.out.println(s);
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		int ri() {
			return Integer.parseInt(string());
		}

		long rl() {
			return Long.parseLong(string());
		}

		double rd() {
			return Double.parseDouble(string());
		}

		String string() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		String[] rsa() {
			return string().split(" ");
		}

		int[] ria() {
			String[] s = rsa();
			int[] arr = new int[s.length];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(s[i]);
			return arr;
		}

		long[] rla() {
			String[] s = rsa();
			long[] arr = new long[s.length];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Long.parseLong(s[i]);
			return arr;
		}

		char[] rca() {
			String s = string();
			char[] arr = new char[s.length()];
			for (int i = 0; i < arr.length; i++)
				arr[i] = s.charAt(i);
			return arr;
		}

		int[] riaml(int m) {
			int[] arr = new int[m];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(string());
			return arr;
		}

		long[] rlaml(int m) {
			long[] arr = new long[m];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Long.parseLong(string());
			return arr;
		}
	}
}

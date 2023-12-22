import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		FastReader r = new FastReader();
		int n = r.ri();
		int[] a = r.ria();
		int[] b = r.ria();
		if(a.length < b.length) {
			int[] temp = a;
			a = b;
			b = temp;
		}
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int xor = 0;
		for(int an : a) {
			if(map.containsKey(an)) {
				xor ^= map.get(an);
				continue;
			}
			int sum = 0;
			for(int bn : b) {				
				sum ^= an+bn; 
			}
			map.put(an,sum);
			xor ^= sum;
		}
		
		print(xor);		
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

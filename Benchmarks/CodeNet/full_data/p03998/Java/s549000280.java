
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class Main {
	public static void main(String[] args) {
		FastReader r = new FastReader();
		Map<String,String> map = new HashMap<>();
		map.put("a", r.str());
		map.put("b", r.str());
		map.put("c", r.str());
		String next = "a";
		int Apos = 0;
		int Bpos = 0;
		int Cpos = 0;
		while(true) {
			if(next.equals("a"))
			{
				if(map.get(next).length() == Apos) {
					print("A");
					return;
				}
				next = ""+map.get(next).charAt(Apos++);				
			}
			if(next.equals("b"))
			{
				if(map.get(next).length() == Bpos) {
					print("B");
					return;
				}
				next = ""+map.get(next).charAt(Bpos++);				
			}
			if(next.equals("c"))
			{
				if(map.get(next).length() == Cpos) {
					print("C");
					return;
				}
				next = ""+map.get(next).charAt(Cpos++);				
			}
		}
	}

	public static void rolling(int[] arr) {
		if (arr.length < 2)
			return;
		for (int i = 1; i < arr.length; i++)
			arr[i] += arr[i - 1];
	}
	
	public static void rolling(long[] arr) {
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
			return Integer.parseInt(str());
		}

		long rl() {
			return Long.parseLong(str());
		}

		double rd() {
			return Double.parseDouble(str());
		}

		String str() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		String[] rsa() {
			return str().split(" ");
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
			String s = str();
			char[] arr = new char[s.length()];
			for (int i = 0; i < arr.length; i++)
				arr[i] = s.charAt(i);
			return arr;
		}
		
		String[] rsaml(int m) {
			String[] arr = new String[m];
			for (int i = 0; i < arr.length; i++)
				arr[i] = str();
			return arr;
		}

		int[] riaml(int m) {
			int[] arr = new int[m];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(str());
			return arr;
		}

		long[] rlaml(int m) {
			long[] arr = new long[m];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Long.parseLong(str());
			return arr;
		}
	}
}

class Node {
	public int val;
	public boolean visited;
	public Node(int v) { val=v; }
}
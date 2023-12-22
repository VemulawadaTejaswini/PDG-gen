import java.util.*;
import java.io.*;

public class Main {
	public static boolean contains(int[] arr, int item) {
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
   }

   public static void main(String[] args) {
		FastScanner in = new FastScanner();
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
		int ans1 = a*b;
		int ans2 = c*d;
		if(ans1 > ans2) {
			System.out.println(ans1);
		}	else if (ans1 < ans2) {
			System.out.println(ans2);
		}
		
	}
	
   static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
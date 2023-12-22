
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9) + 7;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int res = 0;
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			C[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		/*System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		System.out.println(Arrays.toString(C));*/
		
		for (int i = 0; i < B.length; i++) {
			int middle = B[i];
			int upper = binarySearchB(A, middle);
			int lower = n - binarySearchC(C, middle);
			// System.out.println(middle + " upper:" + upper + " lower: " + lower);
			res += (upper * lower);
		}
		
		System.out.println(res);
	}
	
	private static int binarySearchB(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		
		while (left <= right) {
			int mid = (left) + (right - left) / 2;
			if (array[mid] == target) {
				right = mid - 1;
			} else if (array[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}
	private static int binarySearchC(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		
		while (left <= right) {
			int mid = (left) + (right - left) / 2;
			if (array[mid] == target) {
				left = mid + 1;
			} else if (array[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}
	
	
    static class FastReader {
	    BufferedReader br;
	    StringTokenizer st;
	
	    public FastReader() {
	      br = new BufferedReader(new InputStreamReader(System.in));
	    }
	  
	    String next() { 
	      while (st == null || !st.hasMoreElements()) {
	        try {
	          st = new StringTokenizer(br.readLine());
	        } catch (IOException  e) {
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
	
	    String nextLine() {
	      String str = "";
	        try{
	            str = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	      }
	  }
}

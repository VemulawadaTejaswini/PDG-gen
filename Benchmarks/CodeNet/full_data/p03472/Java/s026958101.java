import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int h = sc.nextInt();
		int swipeMax = 0;
		int[] throwW = new int[n];
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			swipeMax = Math.max(swipeMax, a);
			throwW[i] = b;
		}
		
		Arrays.sort(throwW);
		
		int cnt = 0;
		int throwWPos = n - 1;
		
		while (h > 0) {
			int damage = swipeMax;
			
			if (throwWPos >= 0 && throwW[throwWPos] > swipeMax) {
				damage = throwW[throwWPos];
				throwWPos--;
			}
			h -= damage;
			cnt++;
		}
		System.out.println(cnt);
		
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

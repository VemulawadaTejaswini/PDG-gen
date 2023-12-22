
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[] nums = new int[n];
		int[] maxLeft = new int[n];
		int[] maxRight = new int[n];
		// int[] res = new int[n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			
			if (i == 0) {
			maxLeft[i] = nums[i];
			} else {
				maxLeft[i] = Math.max(maxLeft[i-1], nums[i]);
			}
		}
		// System.out.println(Arrays.toString(maxLeft));
		
		for (int i = n - 1; i >= 0; i--) {
			if (i == n - 1) {
				maxRight[i] = nums[i];
			} else {
				maxRight[i] = Math.max(maxRight[i+1], nums[i]);
			}
		}
		// System.out.println(Arrays.toString(maxRight));
		
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				// res[i] = maxRight[1];
				System.out.print(maxRight[1] + " ");
			} else if (i == n - 1){
				// res[i] = maxLeft[i - 1];
				System.out.println(maxLeft[i - 1]);
			} else {
				//res[i] = Math.max(maxRight[i+1], maxLeft[i-1]);
				System.out.print(Math.max(maxRight[i+1], maxLeft[i-1]) + " ");
			}
		}
		
	}
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
}

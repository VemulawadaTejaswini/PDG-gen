import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader scan = new FastReader();
		int n = scan.nextInt(), m = scan.nextInt();
		ArrayList<int[]> a = new ArrayList<>();
		int max = 0;
		char[][] b = new char[n][m];
		for(int i = 0; i < n; i++) {
			String s = scan.next();
			for(int j = 0; j < m; j++) {
				if(s.charAt(j) == '#') a.add(new int[] {i, j});
				b[i][j] = s.charAt(j);
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(b[i][j] == '.') {
					int min = Integer.MAX_VALUE;
					for(int[] l : a) {
						min = Math.min(min, Math.abs(i-l[0]) + Math.abs(j-l[1]));
					}
					max = Math.max(max, min);
				}
			}
		}
		System.out.println(max);

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

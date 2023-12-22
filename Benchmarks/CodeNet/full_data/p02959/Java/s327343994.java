
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int res = 0;
		int[] streets = new int[n+1];
		int[] heroes = new int[n];
		
		for (int i = 0; i < (n + 1); i++) {
			int monster = sc.nextInt();
			streets[i] = monster;
		}
		
		for (int i = 0; i < n; i++) {
			int damage = sc.nextInt();
			heroes[i] = damage;
		}
		
		int left = 0;
		
		for (int i = 0; i < n; i++) {
			int damage = heroes[i];
			int monster = streets[i];
			if (monster > 0) {
				res += left;
				monster -= left;
			}
			
			if (damage >= monster) {
				res += monster;
				left = Math.min(damage, streets[i+1]);
			} else {
				res += Math.min(damage, monster);;
				left = 0;
			}
		}
		
		if (left > 0 && streets[streets.length - 1] > 0) {
			res += left;
		}
		
		System.out.println(res);
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

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		
//		BufferedReader br = new BufferedReader(new FileReader(input_file));
//		PrintWriter out = new PrintWriter(output_file);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
//		String[] input = br.readLine().split(" ");
//		int tc = Integer.parseInt(input[0]);
		int tc = 1;
		for(int iter = 1; iter <= tc; iter++) {
			String str = br.readLine();
			int n = str.length();
			
			long ans = (n * 1l * (n - 1)) / 2 + 1;
			long[] cnt = new long[26];
			
			for(int i = 0; i < n; i++)
				cnt[(int)(str.charAt(i) - 'a')]++;
				
			for(int i = 0; i < 26; i++)
				ans -= (cnt[i] * (cnt[i] - 1)) / 2;
			out.println(ans);
		}
		
		out.close();
		
	}
	
	static void debug(Object... o) {
	    System.out.println(Arrays.deepToString(o));
	}
}

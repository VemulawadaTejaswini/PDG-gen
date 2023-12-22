import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] in = br.readLine().split(" ");
		int A = Integer.parseInt(in[0]);
		int B = Integer.parseInt(in[1]);
		int C = Integer.parseInt(in[2]);
		
		String ans = "No";
		for(int i=1; i<A+B; i++) {
			if(i*A%B == C)
				ans = "Yes";
		}
				
		System.out.println(ans);	
	}
}
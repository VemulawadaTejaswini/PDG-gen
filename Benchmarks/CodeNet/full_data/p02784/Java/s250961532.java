import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] HN = br.readLine().split(" ") ; 
		int H = Integer.parseInt(HN[0]);
		int N = Integer.parseInt(HN[1]);
		
		String[] IN =br.readLine().split(" ") ; 
		int sum = 0;
		for(int n=0; n<N; n++) {
			sum += Integer.parseInt(IN[n]);
		}
		
		String ans = "Yes";
		if(sum<H) {
			ans = "No";
		}
		
		System.out.println(ans);	
		
	}
}
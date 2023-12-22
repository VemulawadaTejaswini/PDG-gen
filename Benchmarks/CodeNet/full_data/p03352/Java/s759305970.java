import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		long ans = 0;
		for(int x=1; x<32; x++) {
			for(int b=2; b<=10; b++) {
				int B = (int)Math.pow(x, b);
				if(B<=X) {
					if(B>ans) {
						ans=B;
					}
				}else{
					break;
				}
			}
		}
		
		System.out.println(ans);	
	}
}
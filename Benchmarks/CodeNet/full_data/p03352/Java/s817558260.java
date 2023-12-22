import java.util.*;
import java.io.*;

public class Main {
		public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] B = new int[32];
		for(int b=0; b<32; b++){
			B[b]=(b+1)*(b+1);
		}
		
		int X = Integer.parseInt(br.readLine());
		int ans = 0;
		for(int x=0; x<32; x++){
			if(B[x]>X){
				ans = B[x-1];
				break;
			}
		}
		
        System.out.println(ans);
    }
}
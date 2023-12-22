import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] Ain = br.readLine().split(" ");
		
		long[] A = new long[N];
		A[0] = Integer.parseInt(Ain[0]);
		long sum = A[0];
		
		for(int a=1; a<N; a++) {
			long get = Integer.parseInt(Ain[a]);
			sum += get;
			A[a] = A[a-1]+get;
		}
		
		long ans = sum;
		for(int i=0; i<N; i++) {
			long check = Math.abs((sum-A[i])-A[i]);
			if(check<=ans) {
				ans = check;
			}
		}

		System.out.println(ans);
	}
}

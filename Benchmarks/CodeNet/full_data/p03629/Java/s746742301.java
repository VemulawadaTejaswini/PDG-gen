import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		int INF = 1_000_000_007;
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		int N = A.length;
		int[] dp = new int[N+1];
		Arrays.fill(dp, INF);
		int[][] next = new int[N+1][26];
		for(int[] next_ : next){
			Arrays.fill(next_, N+1);
		}
		for(int i=N-1; i>=0; i--){
			for(int j=0;j<26;j++)next[i][j] = next[i+1][j];
			next[i][A[i]-'a'] = i+1;
		}
		
		/*
		for(int i=0; i<N+1;i++){
			for(int j=0; j<26;j++){
				System.out.print(next[i][j]+"\t");
			}
			System.out.println();
		}
		*/
		
		//System.out.println(next[0][0]);
		dp[N] = 1;
		
		for(int i=N; i>=0; i--){
			for(int j=0; j<26; j++){
				if(next[i][j] == N+1){
					dp[i] = 1;
				}else{
					dp[i] = Math.min(dp[next[i][j]]+1,dp[i]);
				}
			}
		}
		/*
		for(int i=0;i<N+1;i++)System.out.print(dp[i]);
		System.out.println();
		*/
		
		StringBuilder ans = new StringBuilder("");
		int index = 0;
		while(index <= N){
			if(dp[index] == 1){
				for(int j=0;j<26;j++){
					boolean isNotExist = true;
					for(int i=index;i<N;i++){
						if(A[i] == (char)('a'+j)){
							isNotExist = false;
							break;
						}
					}
					if(isNotExist){
						ans.append((char)('a'+j));
						index = N+1;
						break;
					}
				}
			}else{
				for(int j=0; j<26; j++){
					if(dp[index] == dp[next[index][j]]+1){
						//System.out.println("(っ＾ω＾ｃ)");
						ans.append((char)('a'+j));
						index = next[index][j];
						break;
					}
				}
				//index++;
			}
		}
		
		
		System.out.println(ans);
		
	}
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (c/b);
	}
}


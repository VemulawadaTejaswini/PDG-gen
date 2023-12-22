import java.util.*;
import java.io.*;
public class Main { //atcoder ABC128E -
	public static void main(String[] args) throws Exception {
		
//		int N = 52; long count = 0;
//		for(int i = 0; i <= N; i++){
//			for(int j = 0; j <= N; j++){
//				if((i + j) <= N && (i + j) == (i ^ j)) {
//					count++;
//				}
//			}
//		}
//		System.out.println(count);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] s = br.readLine().toCharArray();
		long tot = 1, two = 1;
		for(int c: s){
			if(c == '1'){
				two = mult(two, 2);
				tot = mult(tot, 3);
			}
			else{
				tot = sum(mult(sub(tot, two), 3), two);
			}
		}
		System.out.println(tot);
	}
	static long MOD = 1000000007;
	static long sum(long a, long b){
		return (a+b)%MOD;
	}
	static long mult(long a, long b){
		return (a*b) % MOD;
	}
	static long sub(long a, long b){
		return sum(a, MOD-b);
	}
}

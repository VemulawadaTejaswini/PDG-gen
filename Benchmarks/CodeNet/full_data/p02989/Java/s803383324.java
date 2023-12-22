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
		int INF = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		//char[] c = sc.next().toCharArray();
		//int N = A.length;
		int N = Integer.parseInt(sc.next());
		int[] d = new int[N];
		for(int i=0; i<N; i++){
			d[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(d);
		
		int low = d[N/2-1];
		int high = d[N/2];
		
		System.out.println(high-low);
		
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


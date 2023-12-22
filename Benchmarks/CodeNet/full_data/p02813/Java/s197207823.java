import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N], Q = new int[N];
		for(int i = 0; i < N; i ++) {
			P[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i ++) {
			Q[i] = sc.nextInt();
		}
	

		long a = ch(N,P), b = ch(N,Q);
		long ans = Math.abs(a-b);
		System.out.println(ans);
	}

	public static long check(int N ,int[] li) {
		ArrayList<Integer> lis = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		long num = 0l;
		int bef = 9;
		for(int i = 0; i < N-1; i++) {
			int x = li[i];
			int m = lis.indexOf(x);
			lis.remove(m);
			long be =0l;
			be = fun(N-i);
			num += be;
		}
		num += 1;
		return num;
	}
	
	public static long ch (int N ,int[] li) {
		ArrayList<Integer> lis = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		int count = 0;
		for(int i = 0; i < N-1; i ++) {
			int x = li[i];
			int m = lis.indexOf(x);
			lis.remove(m);
			count += fun(N-1-i)*m;
		}
		return count;
	}
	
	public static int fun(int n ) {
		int ans = 1;
		for(int i = 0; i < n; i++) {
			ans = ans*(n-i);
		}
		return ans;
	}
}
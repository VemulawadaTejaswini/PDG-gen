

import java.util.*;

public class Main {
	
	static double av[];
	
	public static double max(long v[], int start, int end) {
		double max = 0;
		int bet = end - start + 1;
		int n = v.length;
		
		av = new double[bet];
		
		for(int i = 0; i < bet; ++i) {
			int tmp = i + start;
			for(int j = 0; j < tmp; ++j)av[i] += v[n - 1 - j];
			av[i] /= tmp;
			if(max < av[i])max = av[i];
		}
		
		return max;
	}
	
	public static long comb(long n, long r) {
		if(r < 0)return -1;
		if(n < r) {
			if(n <= 0)return -1;
			else return 1;
		}
		if(r == 0)return 1;
		if(r == 1)return n;
		long ans = 1;
		
		for(int i = 1; i <= r; ++i) {
			ans *= (n - i + 1);
			ans /= i;
		}
		return ans;
	}
	
	public static long solve(long v[], int start, int end, double max) {
		int count[];
		long ans = 0;
		int bet = end - start + 1;
		int n = v.length;
		
		count = new int[end + 1];
		
		for(int k = 1; k <= end; ++k) {
			int tmp = n - 1 - count[k - 1];
			if(tmp < 0)break;
			for(int j = tmp; j >= 0; --j) {
				if(v[j] == v[tmp])++count[k];
				else break;
			}
		}
		
		for(int i = 0; i < bet; ++i) {
			if(av[i] == max) {
				int tmp = i + start;
				long tmp2 = 0, tmp3 = 1;
				for(int j = 1; j <= end; ++j) {
					tmp2 = comb(count[j], tmp);
					if(tmp2 != -1)tmp3 *= tmp2;
					tmp -= count[j];
					if(tmp <= 0)break;
				}
				ans += tmp3;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a, b;
		long v[];
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		v = new long[n];
		for(int i = 0; i < n;++i)v[i] = sc.nextLong();
		
		Arrays.sort(v);
		sc.close();
		double max = max(v, a, b);
		long ans = solve(v, a, b, max);
		System.out.printf("%f\n", max);
		System.out.println(ans);
	}

}

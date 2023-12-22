import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] d = new long[N];
		int[]t = new int[N];
		Data[] v = new Data[N];
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
			d[i] = sc.nextLong();
			v[i] = new Data(t[i], d[i]);
			set.add(t[i]);
		}
		sc.close();
		Arrays.sort(v, new MyCompData());
//		for(int i = 0; i < N; i++) {
//			System.out.println(v[i].c);
//		}
		if(set.size() == N) {
			long ans = 0;
			for(int i = 0; i < K; i++) {
				ans += v[i].c;
			}
			ans += K * K;
			System.out.println(t[N]);
			System.exit(0);
		}
		int l1 = set.size();
		int l2 = N - set.size();
		Long[]d1 = new Long[l1];
		Long[]d2 = new Long[l2];
		set.clear();
		int idx1 = 0;
		int idx2 = 0;
		for(int i = 0; i < N; i++) {
			if(!set.contains(v[i].id)) {
				set.add(v[i].id);
				d1[idx1++] = v[i].c;
			}else {
				d2[idx2++] = v[i].c;
			}
		}
		long[] s1 = new long[l1 + 1];
		long[] s2 = new long[l2 + 1];
		s1[0] = 0;
		s2[0] = 0;
		Arrays.sort(d1, Collections.reverseOrder());
		Arrays.sort(d2, Collections.reverseOrder());
		for(int i = 1; i <= l1; i++) {
			s1[i] += s1[i - 1] + d1[i - 1];
		}
		for(int i = 1; i <= l2; i++) {
			s2[i] += s2[i - 1] + d2[i - 1];
		}
		long ans = 0;
		int max = Math.min(K, l1);
		for(int i = max; i >= 1; i--) {
			if(K - i > l2) break;
			long x = i;
			long sum = s1[i] + s2[K - i] + x * x;
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
	}
	static void disp(Long[] d1) {
		for(long i : d1) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
	static void disp(long[] d1) {
		for(long i : d1) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
	static class Data{
		int id;
		long c;
		public Data(int id, long c) {
			this.id = id;
			this.c = c;
		}
	}
	static class MyCompData implements Comparator<Data>{
		@Override
		public int compare(Data d1, Data d2) {
			if(d1.c < d2.c) {
				return 1;
			}else if(d1.c == d2.c) {
				return 0;
			}else {
				return -1;
			}
		}
	}
}
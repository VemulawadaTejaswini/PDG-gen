import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long[] B = new long[N];
		Data[] d = new Data[N];
		long[] k = new long[N];
		Map<Long, List<Data>> m = new HashMap<Long, List<Data>>();
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
			k[i] = A[i] - B[i];
			if(m.containsKey(k[i])) {
				m.get(k[i]).add(new Data(i, A[i], B[i]));
			}else {
				List<Data> list = new ArrayList<Data>();
				list.add(new Data(i, A[i], B[i]));
				m.put(k[i], list);
			}
		}
		sc.close();
		Arrays.sort(k);
//		for(long i : k) {
//			System.out.println(i);
//		}
		int turn = 1;
		int l = 0;
		int r = N - 1;
		long a = 0;
		long b = 0;
		for(int i = 0; i < N; i++) {
			if(turn == 1) {
				List<Data> list = m.get(k[i]);
				Collections.sort(list, new MyComp2());
				a += list.get(0).A;
				list.remove(0);
				l++;
				turn *= -1;
			}else {
				List<Data> list = m.get(k[i]);
				Collections.sort(list, new MyComp1());
				b += list.get(0).B;
				list.remove(0);
				r--;
				turn *= -1;
			}
		}
		long ans = a - b;
		System.out.println(ans);
	}
	static class Data{
		int id;
		long A, B,e;
		public Data(int id, long A, long B) {
			this.id = id;
			this.A = A;
			this.B = B;
			this.e = A - B;
		}
	}
	static class MyComp1 implements Comparator<Data>{
		@Override
		public int compare(Data d1, Data d2) {
			if(d1.A < d2.A) {
				return 1;
			}else if(d1.A == d2.A){
				return 0;
			}else {
				return -1;
			}
		}
	}
	static class MyComp2 implements Comparator<Data>{
		@Override
		public int compare(Data d1, Data d2) {
			if(d1.B < d2.B) {
				return 1;
			}else if(d1.B == d2.B){
				return 0;
			}else {
				return -1;
			}
		}
	}
	static class MyCompData implements Comparator<Data>{
		@Override
		public int compare(Data d1, Data d2) {
			if(d1.e < d2.e) {
				return -1;
			}else if(d1.e == d2.e) {
				if(d1.A < d2.A) {
					return 1;
				}else if(d1.A == d2.A) {
					return 0;
				}else {
					return -1;
				}
			}else {
				return 1;
			}
		}
	}
}
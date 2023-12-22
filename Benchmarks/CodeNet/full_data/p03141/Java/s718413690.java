import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long[] B = new long[N];
		Long[] k = new Long[N];
		Data[] v = new Data[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
			v[i] = new Data(i, A[i], B[i]);
		}
		int turn = 1;
		long a = 0;
		long b = 0;
		Arrays.sort(v, new  MyComp());
		for(int i = 0; i < N; i++) {
			if(turn == 1) {
				a += v[i].A;
				turn *= -1;
			}else {
				b += v[i].B;
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
	static class MyComp implements Comparator<Data>{
		@Override
		public int compare(Data d1, Data d2) {
			long t1 = Math.max(d1.A, d1.B);
			long t2 = Math.max(d2.A, d2.B);
			if(t1 < t2) {
				return 1;
			}else if(t1 == t2) {
				long e1 = Math.abs(d1.A - d1.B);
				long e2 = Math.abs(d2.A - d2.B);
				if(e1 == e2) {
					return 1;
				}else if(e1 == e2) {
					return 0;
				}else {
					return -1;
				}
			}else {
				return -1;
			}
		}
	}
}
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long[] B = new long[N];
		Data[] d = new Data[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
			d[i] = new Data(i, A[i], B[i]);
		}
		sc.close();
		Arrays.sort(d, new MyComp());
		long k = 0;
		for(int i = 0; i < N; i++) {
			if(i % 2 == 0) {
				k += d[i].A;
			}else {
				k -= d[i].B;
			}
		}
		System.out.println(k);
	}
	static class Data{
		int id;
		long A, B,e;
		public Data(int id, long A, long B) {
			this.id = id;
			this.A = A;
			this.B = B;
			this.e = A + B;
		}
	}
	static class MyComp implements Comparator<Data>{
		@Override
		public int compare(Data d1, Data d2) {
			if(d1.e < d2.e) {
				return -1;
			}else if(d1.e == d2.e){
				return 0;
			}else {
				return -1;
			}
		}
	}
}
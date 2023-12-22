import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int []a = new int[M];
		int []b = new int[M];
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if(b[i] > N) continue;
		}
		sc.close();
		Data []d = new Data[M];
		for(int i = 0; i < M; i++) {
			d[i] = new Data(a[i], b[i]);
		}
		Arrays.sort(d, new MyComparator());
		int cnt = 0;
		int s = 0;
		for(int i = 0; i < M; i++) {
			if(d[i].a > s) {
				s = d[i].b - 1;
				cnt++;
			}
		}
//		for(Data t : d) {
//			System.out.println(t.b);
//		}
		System.out.println(cnt);
	}
	static class Data{
		int a;
		int b;
		public Data(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
	static class MyComparator implements Comparator<Data>{
		 @Override
		 public int compare(Data d2, Data d1) {
			 if(d1.b == d2.b) {
				 return d2.a - d1.a;
			 }else {
				 return d2.b - d1.b;
			 }
		 }
	}
}
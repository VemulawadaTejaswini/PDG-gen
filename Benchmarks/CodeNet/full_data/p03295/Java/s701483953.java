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
			if(s < d[i].b) {
				s = d[i].b;
				cnt++;
			}
		}
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
		 public int compare(Data d1, Data d2) {
			 if(d1.b < d2.b) {
				 return 1;
			 }else if(d1.b > d2.b) {
				 return -1;
			 }else {
				 return 0;
			 }
		 }
	}
}
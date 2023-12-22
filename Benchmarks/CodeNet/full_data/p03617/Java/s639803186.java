import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Little[] little= new Little[4];
		int omo=1;
		Main main = new Main();
		for (int i=0;i<4;i++) {
			Little l = main.new Little();
			l.l= omo;
			l.yen = sc.nextLong();
			little[i] = l;
			omo *=2;
		}
		Arrays.sort(little);
		long N = sc.nextLong();
		N*=4;
		long sum =0;
		for (int i=0;i<4;i++) {
			long num = N/little[i].l;
			sum +=num*little[i].yen;
			N -= N/little[i].l*little[i].l;
		}
		System.out.println(sum);
	}

	public class Little implements Comparable<Little> {
		int l;
		long yen;
		@Override
		public int compareTo(Little l) {
			long t= yen *(8/this.l);
			long li= l.yen*(8/l.l);
			if (t>li) {
				return 1;
			}
			if (t<li) {
				return -1;
			}
			if (this.l>l.l) {
				return 1;
			}
			return -1;
		}
	}
}
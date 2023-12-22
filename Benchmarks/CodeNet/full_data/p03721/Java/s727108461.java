import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Number number[] = new Number [N];
		Main main = new Main();
		for (int i=0;i<N;i++) {
			Number num = main.new Number();
			num.a=sc.nextInt();
			num.b= sc.nextInt();
			number[i] =num;
		}
		Arrays.sort(number);
		int count =0;
		for (int i=0;i<N;i++) {
			count+=number[i].b;
			if (count>=K) {
				System.out.println(number[i].a);
				return;
			}
		}
	}
	public class Number implements Comparable<Number> {

		int a ;
		int b;
		@Override
		public int compareTo(Number o) {
			return this.a-o.a;
		}

	}
}
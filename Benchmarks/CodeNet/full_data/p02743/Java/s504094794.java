import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		if ( a+b>=c ) {
			System.out.println("No");
			System.exit(0);
		}

		long n = (c-a-b)*(c-a-b);
		long m = a*b*4l;
		if ( m < n ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
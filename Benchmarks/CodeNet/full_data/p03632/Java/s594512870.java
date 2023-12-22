import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int a = sc.nextInt();// Alice A秒
		int b = sc.nextInt();// Alice B秒
		int c = sc.nextInt();// Bob C秒
		int d = sc.nextInt();// Bob D秒

		// 計算
		int t = 0;

		// abcd
		if(b <= c) t = 0;
		// acbd
		if(a <= c && c <= b && b <= d) t = b - c;
		// cabd
		if(c <= a && b <= d) t = b - a;
		// acdb
		if(a <= c && d <= b) t = d - c;
		// cadb
		if(c <= a && a <= d && d <= b) t = d - a;
		// cdab
		if(d <= a) t = 0;

		// 出力
		System.out.println(t);

	}
}



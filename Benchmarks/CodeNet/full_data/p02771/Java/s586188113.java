import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		String s = "No" ;

		if ( a==b || b==c || c==a )  s = "Yes" ;
		if ( a==b && b==c ) s = "No" ;
		// 出力
		System.out.println(s);
	}
}
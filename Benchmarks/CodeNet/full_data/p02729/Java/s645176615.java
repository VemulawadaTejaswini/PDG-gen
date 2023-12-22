import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		int k = n*(n-1)/2 + m*(m-1)/2 ;

		// 出力
		System.out.println(k);
	}
}
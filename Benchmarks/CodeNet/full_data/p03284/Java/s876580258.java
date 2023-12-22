import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//数値の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		//計算
		int a = N / K;
		int b = N % K;
		int c = (a + b) - a;
		//出力
		System.out.println(c);
	}
}
import java.util.Scanner;
import java.math.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int a = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		//1文字ずつ
		//s.atChar(i);
		// 出力
		//System.out.println("");
		int count=0;
		int D=sc.nextInt();
		int N=sc.nextInt();
		if(N==100){
			N=N+1;
		}
		
		int x=(int)Math.pow(100, D)*N;
		System.out.println(x);
		
	}
}
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
		int N=sc.nextInt();
		int NN=N;
		int sum=0;
		while(N!=0){
			sum+=(N%10);
			N=N/10;
		}
		if(NN%sum==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
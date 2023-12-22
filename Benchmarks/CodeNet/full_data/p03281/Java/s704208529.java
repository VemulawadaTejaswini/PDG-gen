import java.util.Scanner;
import java.util.regex.*;
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
		//double countx=0;
		int N=sc.nextInt();
	
		int[] cheat = new int[200];
		
		cheat[0]=105;
		cheat[1]=135;
		cheat[2]=165;
		cheat[3]=189;
		cheat[4]=195;
		
		if(N>194){
			System.out.println(5);
		}else if(N>188){
			System.out.println(4);
		}else if(N>164){
			System.out.println(3);
		}else if(N>134){
			System.out.println(2);
		}else if(N>104){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
}
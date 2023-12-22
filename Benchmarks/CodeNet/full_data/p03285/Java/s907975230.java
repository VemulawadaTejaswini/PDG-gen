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
		
		int[][] nums=new int[25][15];
		
		for(int i=0;i<25;i++){
			for(int j=0;j<15;j++){
				nums[i][j]=4*i + 7*j;
			}
		}
	
		boolean x=false;
		
		yy:for(int i=0;i<25;i++){
			for(int j=0;j<15;j++){
				if(N==nums[i][j]){
					x=true;
					break yy;
				}
			}
		}
		if(x){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}
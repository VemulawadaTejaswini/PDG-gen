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
		int M=sc.nextInt();
		int Q=sc.nextInt();
		
		int[] L=new int[M];
		int[] R=new int[M];
		int[] p=new int[Q];
		int[] q=new int[Q];
		
		int[] ans=new int[Q];
		
		for(int i=0;i<M;i++){
			L[i]=sc.nextInt();
			R[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<Q;i++){
			p[i]=sc.nextInt();
			q[i]=sc.nextInt();
		
			int count=0;
			
			for(int j=0;j<M;j++){
				if(p[i]<=L[j] && R[j]<=q[i]){
					count++;
				}
				
			}
			ans[i]=count;
		}
		
		for(int i=0;i<Q;i++){
			System.out.println(ans[i]);
		}
		
		
		System.exit(0);
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[]A = new int[N];
			int[]B = new int[N];// ソート用
			
			
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				B[i] = A[i];
			}			
			Arrays.sort(B);
			
			
			int x = B[N-1];//ソートした最大値
			int dx=x;
			for(int i = N-1;i>=0;i--) {
				if(B[i]<x) {
					dx = B[i];//ソートした最大値よりワンランク低い値
					break;
				}
			}
			/*
			for(int i =0;i<N;i++) {
				System.out.println(B[i]);
			}*/
			
			
			//System.out.println(x);
			//System.out.println(dx);
			
			for(int i = 0;i<N;i++) {
				
				if(A[i]<x) {//A[i]が最大値より小さいならそれ取り除いても最大値は残る
					System.out.println(x);
				}else{//Aが最大値ならそれよりワンランク下の値を表示する
					System.out.println(dx);
					
				}
			}
			
		}
		
		
	}
		

}

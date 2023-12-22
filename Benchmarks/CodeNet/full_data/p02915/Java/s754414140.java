import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		//int[] a = new int[n];
		/*
		for(int i =0 ; i<n;i++) {
			a[i] = sc.nextInt();
		}
		*/
		
		System.out.println(n*n*n);
	}
}
package test.ABC120;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// データの取得
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		int result_cnt=0;
		for(int i=1;i<100;i++) {
			if(A % i == 0 && B % i ==0) {
				result_cnt++;
				if(result_cnt == K) break;
			}
		}
		System.out.println(result_cnt);
	}
}

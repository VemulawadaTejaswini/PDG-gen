

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//データの数 
		int V[] = new int[N]; //配列数を決定
		int C[] = new int[N]; //配列数を決定
		int ans[] = new int[N]; //配列数を決定
		
		for(int i = 0; i<N; i++) {
			V[i] = sc.nextInt(); //配列の中身を挿入
			
		}
		
		for(int i = 0; i<N; i++) {
            C[i] = sc.nextInt(); //配列の中身を挿入
		}
	
		for(int i = 0; i<N; i++) {
            ans[i]=V[i]-C[i]; 
		}
		
		// int配列をInteger配列にコピー(キャスト)
		Integer[] ans1 = new Integer[ ans.length ];
		for ( int i = 0; i < ans.length; ++ i ) {
		    ans1[i] = ans[i];
		 		}
		 	// 降順ソート
		Arrays.sort( ans1, Collections.reverseOrder() );
		
		// Integer配列をint配列にコピー(再キャスト)
		for ( int i = 0; i < ans1.length; ++ i ) {
		 	ans[i] = ans1[i];
		}
		 // 配列の中身を表示
		//for ( int i = 0; i < ans.length; ++ i ) {
		// 	System.out.println(ans[i]);
		//}
		int nums = 0;
		for ( int i = 0; i < ans.length; ++ i ) {
		  if(ans[i]>0) {
		      nums +=ans[i];
		  }else {
			  nums += 0;
		  }
		}
		System.out.println(nums);
	}
	
}

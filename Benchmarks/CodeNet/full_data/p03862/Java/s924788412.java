import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// 入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		
		// キャンディー操作
		int totalEat = 0;		// 食べる必要がある合計キャンディー数
		for(int i = 0; i < N-1; i++){
			if(X < getCandies(A, i)){
				int eat = getCandies(A, i) - X;
				// 右の箱から優先して食べる
				if(A[i+1] < eat){
					A[i] = A[i] - (eat - A[i+1]);
					A[i+1] = 0;
				}else{
					A[i+1] = A[i+1] - eat;
				}
				totalEat += eat;
			}
		}
		
		// 出力
		System.out.println(totalEat);
	}

	// 隣り合う２つの箱の合計キャンディー数を求める関数
	public static int getCandies(int[] Array, int index){
		return Array[index] + Array[index+1];
	}

}

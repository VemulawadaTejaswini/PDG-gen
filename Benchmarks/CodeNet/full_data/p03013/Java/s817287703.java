import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//　総段数と穴あき段数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//　穴あきの段、総和計算用の配列を用意
		Integer a[] = new Integer[M];
		int sum[] = new int[N+1];
		
		//　壊れている段目の情報を格納
		for(int i=0;i<M;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<=N;i++) {
			if(i == 0) {
				//0段目の処理
				sum[i] = 1;
			}
			else if(i == 1) {
				//1段目の処理
				if(Arrays.asList(a).contains(i)) {
					sum[i] = 0;
				}else {
					sum[i] = 1;
				}
			}else {
				//2段目からの処理
				if(Arrays.asList(a).contains(i)) {
					sum[i] = 0;
				}else {
					sum[i] = sum[i-2] + sum[i-1];
				}
			}
		}
		System.out.println(sum[N]%1000000007);
	}
	
}

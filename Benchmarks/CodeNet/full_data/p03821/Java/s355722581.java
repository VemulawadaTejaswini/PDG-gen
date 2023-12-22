package AtCorder1;

import java.util.Scanner;

public class AtCorer1Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int cnt = 0;
		int ans = 0;
		
		// 入力処理
		Scanner inData = new Scanner(System.in);
		
		int len = inData.nextInt();
		
		int a[] = new int[len];
		int b[] = new int[len];
		
		for(cnt = (len - 1); cnt >= 0; cnt--){
			a[cnt] = inData.nextInt();
			b[cnt] = inData.nextInt();
		}
		
		// 計算処理
		for(cnt = 0; cnt < len; cnt++){
			while(0 != (a[cnt] % b[cnt])){
				for(int add = 0; add < len; add++){
					a[add]++;
				}
				ans++;
			}
		}
		System.out.println(ans);
	}
}

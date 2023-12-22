import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){

			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int D = sc.nextInt();
			int N = sc.nextInt();
			
			if(N==100){
				N=101;
			}
			
			long kazu = 100;
			
			double warikire = (long) Math.pow(kazu, D);
//			System.out.println(warikire);
			long ans = (long) (warikire * N);

			// 出力
			System.out.println(ans);
			return ;
		}
}

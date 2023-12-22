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
			
			int kazu = 100;
			int warikire ;
			if(D==0){
				 warikire = kazu;
			}else if(D==1){
				 warikire = kazu*kazu;
				
			}else{
				 warikire = kazu*kazu*kazu;
				
			}
//			int warikire = (int) Math.pow(kazu, D);
			int ans = warikire * N;

			// 出力
			System.out.println(ans);
			return ;
		}
}

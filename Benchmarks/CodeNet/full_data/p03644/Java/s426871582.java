import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int N = sc.nextInt();
			
			if (N == 1){
	       		// 出力
	        	System.out.println(1);
	        	return ;
	        	
			}

			int n = N;
			int ans = 0;
			int kaisu = 0;
			
			for (int i = 1; i <= N;i ++ ){
				int work = keisan(i);
				if (kaisu < work){
					kaisu = work;
					ans = i;
				}
			}

       		// 出力
        	System.out.println(ans);
		}

		private static int keisan(int N) {
			int n = N;
			int ans = 0;

			for (int i = 1; i <= N;i ++ ){
				int work = n % 2;
				if (work == 1){
					i = N ;
				}else{
					ans++ ;
					n = n / 2;
				}
			}
			return ans;
		}

}

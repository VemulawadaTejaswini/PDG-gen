import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int N = sc.nextInt();

			ArrayList<Integer> stateList = new ArrayList<Integer>();
					
			for (int i = 0; i < N;i ++ ){
				// 整数の入力
				// スペース区切りの整数の入力
				stateList.add(sc.nextInt());
			}
			 
//			Collections.sort(stateList);

			int ans = 0;
			for(int i= 1 ;i < N - 1 ;i++){
				int sum_a = stateList.get(0) ;
				for(int j= 1 ;j < i ;j++){		
					sum_a = sum_a + stateList.get(j);
				}
				int sum_b = stateList.get(N - 1) ;
				for(int k = i ;k < N - 1 ;k++){		
					sum_b = sum_b + stateList.get(i);
				}
				
				if (i == 1){
					ans = (sum_a - sum_b);
					ans = Math.abs (ans);
				}else{
					int work = sum_a - sum_b;
					work = Math.abs(work);
					if (ans > work){
						ans = work;
					}
				}
			}
			if (N == 2){
				ans = stateList.get(0) - stateList.get(1);
				ans = Math.abs (ans);
			}

       		// 出力
        	System.out.println(ans);
		}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){

			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int N = sc.nextInt();
			int res = N;
			
			for(int i = 0;i < N;i++){
				
				int cc = 0;
				int t = i;
				while(t>0){
					cc+=t%6;
					t/=6;
				}
//				System.out.println("i6="+i);
				t=N-i;
				while(t>0){
					cc+=t%9;
					t/=9;
				}
//				System.out.println("i9="+i);
				if(res>cc){
					res = cc;
				}
//				System.out.println("cc="+cc);
			}
       		// 出力
			System.out.println(res);

			return ;
		}

}

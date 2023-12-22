import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		int y = Y/1000;		//1,5,10の和とする
		boolean flag = false;
		sc.close();
		int[] ans = new int[3];
		if (N*10<y){
			//N枚の最高金額がY円以下（不適）
			Arrays.fill(ans, -1);
		}else if(N>y){
			//N枚の最低金額がY円以上（不敵）
			Arrays.fill(ans, -1);
		}else{
			for(int a_1=0; a_1<N+1; a_1++){
				if(flag)break;
				for(int a_2=0;a_1+a_2<N+1;a_2++){
					int a_3 = N - (a_1+a_2);
					int sum = a_1*10 + a_2*5 + a_3;
					if(sum == y){
						ans[0] = a_1;
						ans[1] = a_2;
						ans[2] = a_3;
						flag = true;
						break;
					}
				}
			}
			if(!flag){
				Arrays.fill(ans, -1);
			}
		}
		for(int i : ans){
			System.out.print(i+" ");
		}
		
	}
	
	public static int sum(Integer[] b){
		int sum=0;
		for(int n : b){
			sum += n;
		}
		return sum;
	}
}

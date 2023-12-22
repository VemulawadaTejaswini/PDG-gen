import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextInt(); //入力数
		int K = sc.nextInt(); //進数
		
		double max = 0; //入力した数より小さい数のうち最大の進数の累乗
		double count = 0; //累乗のカウント
		
		
		a: while(max < N){
			for(int i=0;i<K;i++){
				max = Math.pow(K, count) * i;
				//System.out.println("max:"+max+"count:"+count);
				if(N < max){
					if(i == 1) count = count - 1;
					break a;
				}
			}
			count++;
		}
			
		int ans = (int)count + 1;
		System.out.println(ans);
	}
}

		
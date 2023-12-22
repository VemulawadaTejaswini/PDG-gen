

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long count = 1;
		long waru =  1000000007l;
		long waru1 = 1000000007l;

		if(n == m){
			for(long i = 2; i <= n; i++){
				count *= i;
				long a = count % waru;
				if(a % waru != 0){
					count = a;
				}
			}
			for(long i = 2; i <= m; i++){
				count *= i;
				long a = count % waru;
				if(a % waru != 0){
					count = a;
				}
			}
			count = count * 2 % waru1;
			System.out.println(count);
		}else if(n - m == 1 || m-n==1){
			for(long i = 2; i <= n; i++){
				count *= i;
				long a = count % waru;
				if(a % waru != 0){
					count = a;
				}
			}
			for(long i = 2; i <= m; i++){
				count *= m;
				long a = count % waru;
				if(a % waru != 0){
					count = a;
				}
			}
			System.out.println(count%waru1);
		}else{
			System.out.println(0);
		}
		in.close();
	}
}

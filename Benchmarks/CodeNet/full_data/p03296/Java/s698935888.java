import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// スライムの数の入力
		int n = sc.nextInt();
		int i = 0;
		int k = 0;
		int c = 0;
		// 並んでいるスライムの入力
		while(i + 2 < n){
			int a = sc.nextInt();
				if(a == c){
					k = k + 1;
				}
			int b = sc.nextInt();
				if(a == b){
					k = k + 1;
					
				}
			c = b;
			i = i + 2;
		}
		
		
		// 出力
		System.out.println(k);
	}
}
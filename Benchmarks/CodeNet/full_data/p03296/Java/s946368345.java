import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// スライムの数の入力
		int n = sc.nextInt();
		int i = 0;
		int k = 0;
		int c = 0;
		int z = 1;
		// 並んでいるスライムの入力
		while(i + 2 < n){
			int a = sc.nextInt();
				if(a == c){
					k = k + 1;
					z = z + 1;
				}
			int b = sc.nextInt();
				if(a == b && z == 0){
					k = k + 1;
					
				}
			c = b;
			i = i + 2;
			z = 0;
		}
		
		
		// 出力
		System.out.println(k);
	}
}
import java.util.*;

public class Main{
	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
				// 整数の入力
				int N = sc.nextInt();
				// スペース区切りの整数の入力
				int K = sc.nextInt();
				int start = 1;
				int temp = start;
				for (int i = 0; i < N; i++) {
					
					temp = Math.min(temp+K, temp*2);
				}
				
				// 出力
				System.out.println(temp);
	
	}
}

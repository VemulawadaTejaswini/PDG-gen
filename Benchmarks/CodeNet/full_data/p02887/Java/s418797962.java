import java.util.*;
/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int count = 1;
		String x = sc.next();
		String y;
		if(N!=1){
			for(int i = 2;i<=N;i++){
				y = sc.next();
				if(x!=y){
					count=count+1;
					x=y;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
};
import java.util.*;
public class C {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
		int K = sc.nextInt();
		int cnt = 0;

	
		if(K%2==0){
			int tmp = N;
			for(int i=2;i<=K;i*=2){
				tmp = N;
				cnt+=(tmp/i);
			}
		}
		// 出力
		System.out.println(cnt);
	}
}
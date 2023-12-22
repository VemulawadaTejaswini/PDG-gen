import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		int min = 1;
		int max = n;

		for(int i=0;i<m;i++){
			min = Math.max(min,sc.nextInt());
			max = Math.min(max,sc.nextInt());
		}

		int ans = Math.max(0,max-min+1);

		// 出力
		System.out.println(ans);
	}
}
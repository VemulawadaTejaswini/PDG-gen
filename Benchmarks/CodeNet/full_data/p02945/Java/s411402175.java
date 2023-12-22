	import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map <Long,Long> mapA = new HashMap<Long,Long> ();
		Map <Long,Long> mapB = new HashMap<Long,Long> ();
			// 整数の入力
		int a,b,ans;

		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		if(a-b>a+b) {
			ans=a-b;
		}
		else {
			ans=a+b;
		}
		if(a*b>ans) {
			System.out.print(a*b);
		}
		else {
			System.out.print(ans);
		}

			// 出力
 
	}
}
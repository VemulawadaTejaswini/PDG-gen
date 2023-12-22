	import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,m,answer,index;
		float ans;
		String s,t;
		
			// 整数の入力
		
		n = sc.nextInt();
		sc.close();
		
		if(n%2==0){
			System.out.print("0.5");
		}
		else {
			m=(n+1)/2;
			ans=(float)m/n;
			System.out.print(ans);
		}

			// 出力
 
	}
}	
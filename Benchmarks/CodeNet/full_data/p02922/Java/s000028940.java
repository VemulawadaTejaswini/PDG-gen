	import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int answer,index;
		int a,b;
		String s,t;
		
			// 整数の入力
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		answer=(b-1+a-2)/(a-1);
		System.out.print(answer);

			// 出力
 
	}
}	
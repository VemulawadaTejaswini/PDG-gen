import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int a;
			int b;
			int result;
			a = sc.nextInt();
			b = sc.nextInt();
			if (a>b) {
				if(a-1>b) {
					result=a+(a-1);
					}
				else{
					result=a+b;
					}
				}
			else {
				if(b-1>a) {
					result=b+(b-1);
					}
				else{
					result=a+b;
					}
			}
			// 出力

			System.out.println(result);
	}
}
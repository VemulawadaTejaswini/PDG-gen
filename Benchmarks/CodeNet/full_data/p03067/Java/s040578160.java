import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			String s;
			String s1;
			int a,b,n;
			int index;
			String result;

			a = sc.nextInt();
			b = sc.nextInt();
			n = sc.nextInt();
			sc.close();

			if(a<b) {
				if(a<n && n <b) result="yes";
				else result="no";
			}
			else if(a>b) {
				if(a>n && n>b) result="yes";
				else result="no";
			}
			else  {
				if(a==n) result="yes";
				else result="no";
			}

			// 出力

			System.out.println(result);
	}
}
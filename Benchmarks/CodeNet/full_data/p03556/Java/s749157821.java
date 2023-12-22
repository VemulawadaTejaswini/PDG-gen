import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// 文字列の入力
		//String s1 = sc.next();

		int a=0;
		int b=0;
		for(int i=0;a<=n;i++){
			b = a;
			a = (int)Math.pow(i, 2);
		}

		// 出力
		System.out.println(b);
	}
}

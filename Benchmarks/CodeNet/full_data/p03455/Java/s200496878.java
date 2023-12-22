import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ans = "";

		if(a*b%2==0){
			ans = "Even";
		}else{
			ans = "Odd";
		}

		// 出力
		System.out.println(ans);
	}
}

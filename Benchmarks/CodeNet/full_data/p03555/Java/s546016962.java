import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int n = sc.nextInt();

		// 文字列の入力
		String s1 = sc.next();
		String s2 = sc.next();

		boolean status = s1.charAt(0)==s2.charAt(2) &&
				s1.charAt(1)==s2.charAt(1) &&
				s1.charAt(2)==s2.charAt(0);


		String ans;
		if(status){
			ans = "YES";
		}else{
			ans="NO";
		}
		// 出力
		System.out.println(ans);
	}
}

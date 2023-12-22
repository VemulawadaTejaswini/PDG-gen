import java.util.Scanner;

public class NestedlfStatement1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		System.out.print("天気を入力:");
		String S=sc.nextLine();

		if(S.equals("Sunny")) {
			System.out.println("Coudy");
		}else if(S.equals("Cloudy")) {
			System.out.println("Rainy");
		}else {
			System.out.println("Sunny");
		}


	}

}
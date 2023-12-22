import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		if(a == 000) {
			System.out.println("0");
		}else if(a == 001 || a == 010 || a == 100) {
			System.out.println("1");
		}else if(a == 011 || a == 101 || a == 110){
			System.out.println("2");
		}else {
			System.out.println("3");
		}

	}

}

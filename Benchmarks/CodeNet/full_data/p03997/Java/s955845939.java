import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int total = 0;

		if( a <100 && b<100 && c<100){
			total = (a+b)*c/2;
		}else {
			System.out.println("1～100の数字を指定してください。");
		}

		System.out.println(total);


	}

}
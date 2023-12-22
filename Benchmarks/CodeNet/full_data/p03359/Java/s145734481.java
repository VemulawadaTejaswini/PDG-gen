import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int takahasi=0;
		takahasi = a-1;
		if(b>=a) {
			takahasi++;
		}
		System.out.println(takahasi);
	}

}

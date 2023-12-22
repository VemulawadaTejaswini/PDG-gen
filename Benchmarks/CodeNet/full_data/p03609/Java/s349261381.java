import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int t = scan.nextInt();
		int show =x-t;
		if(show<=0) {
			show=0;
		}
		System.out.println(show);
	}

}

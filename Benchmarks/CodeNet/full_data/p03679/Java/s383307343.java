import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int a=stdin.nextInt();
		int b=stdin.nextInt();
		int c=stdin.nextInt();
		if(a-b<=0) {
			System.out.println("delicious");
		} else if(a-b<=c) {
			System.out.println("safe");

		}else {
			System.out.println("dangerous");

		}
		

	}

}

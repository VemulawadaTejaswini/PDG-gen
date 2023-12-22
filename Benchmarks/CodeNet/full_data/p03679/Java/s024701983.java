import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();

		//safeライン：b-a<x
		//おいしいライン:b-a<=0
		if(b-a<x && b-a>=0) {
			System.out.println("safe");
		}else if(b-a<0) {
			System.out.println("delicious");
		}else {
			System.out.println("dangerous");
		}
	}

}

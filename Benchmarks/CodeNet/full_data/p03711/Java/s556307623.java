import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int groX=0;
		int groY=0;

		if(x==4||x==6||x==9||x==11) {
			groX=2;
		}else if(x==2) {
			groX=3;
		}else {
			groX=1;
		}

		if(y==4||y==6||y==9||y==11) {
			groY=2;
		}else if(y==2) {
			groY=3;
		}else {
			groY=1;
		}

		if(groX==groY) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

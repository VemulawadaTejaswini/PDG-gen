import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		int n = 1;

		while(true) {
			int m = a*n-(n-1);
			if(m>=b) {
				break;
			}
			n++;
		}

		System.out.println(n);


	}

}

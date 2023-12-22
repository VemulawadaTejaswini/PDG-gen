import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int k = scanner.nextInt();
		if(a >= b && a>=c) {
			a *= (int)Math.pow(2, k);
		}else if(b > a && b >= c) {
			b *= (int)Math.pow(2, k);
		}else {
			c *= (int)Math.pow(2, k);
		}
		
		System.out.println(a+b+c);		
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		sc.close();
/*
		double num1 = Math.sqrt(a);
		double num2 = Math.sqrt(b);
		double num3 = Math.sqrt(c);
*/

		double ab = a*b;
		double bc = b*c;
		double ca = c*a;

		if(0 < (c-a)*(c-a) + b*b - 2*(ab + bc) ){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

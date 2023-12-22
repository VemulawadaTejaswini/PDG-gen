import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		double ans =0;
		double count =0;
		for(double i=0;;i++) {
			if(Math.pow(2, i)<=n) {
				count++;
			}else {
				break;
			}

		}
		System.out.println((int)Math.pow(2, count-1));

	}

}

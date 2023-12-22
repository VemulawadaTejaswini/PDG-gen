import java.util.Scanner;

/**
 * @author yamino
 *
 */
public class Main {
	public static void main(String[] args) {
		//入力
		Scanner sc = new Scanner(System.in);
		String tmp = sc.next();
		sc.close();
		//整形
		StringBuffer sb = new StringBuffer(tmp);
		int num1 = Integer.parseInt(sb.substring(0, 2));
		int num2 = Integer.parseInt(sb.substring(2, 4));

		//分岐
		if(num1 <= 12 && num2 <= 12 && num1 >=1 && num2 >=1) {
			System.out.println("AMBIGUOUS");
			return;
		}else if(num1 <= 12 && num1 >= 1) {
			System.out.println("MMYY");
			return;
		}else if(num2 <= 12 && num2 >= 1) {
			System.out.println("YYMM");
			return;
		}else {
			System.out.println("NA");
			return;
		}
	}
}
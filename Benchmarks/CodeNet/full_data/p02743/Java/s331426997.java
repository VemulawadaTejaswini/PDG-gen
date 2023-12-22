import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long number_1 = sc.nextInt();
		long number_2 = sc.nextInt();
		long number_3 = sc.nextInt();
		sc.close();

		if(Math.sqrt(number_1) + Math.sqrt(number_2) < Math.sqrt(number_3)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

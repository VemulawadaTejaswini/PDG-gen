import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int tmp = a;
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			if(tmp == 0) break;
			sum += tmp % 10;
			tmp /= 10;
		}
		if(a % sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
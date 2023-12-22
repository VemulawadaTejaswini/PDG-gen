
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int thirdPlace = N / 100;
		int secondPlace = (N - thirdPlace*100)/10;
		int firstPlace = N - thirdPlace*100 - secondPlace*10;
		if(thirdPlace == 7 || secondPlace == 7 || firstPlace == 7) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

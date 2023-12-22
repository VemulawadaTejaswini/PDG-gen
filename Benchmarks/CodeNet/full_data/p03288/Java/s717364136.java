import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int R = stdIn.nextInt();

		if(R < 1400) {
			System.out.println("ABC");
		}
		else if(R < 2800)
		{
			System.out.println("ARC");
		}
		else
		{
			System.out.println("AGC");
		}


	}

}

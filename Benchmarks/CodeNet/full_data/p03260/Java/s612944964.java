import java.util.Scanner;

public class A109 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int A = stdIn.nextInt();
		int B = stdIn.nextInt();

		if(A%2 == 1 && B%2 == 1)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}



	}

}

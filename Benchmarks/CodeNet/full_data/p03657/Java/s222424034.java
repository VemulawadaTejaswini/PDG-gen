import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		
		if(A % 3 == 0 || B % 3 == 0 || (A+B) % 3 == 0)
		{
			System.out.println("Possible");
		}
		else
		{
			System.out.println("Impossible");
		}

	}

}

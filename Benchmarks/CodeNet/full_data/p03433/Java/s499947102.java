import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int A = stdIn.nextInt();
		
		N %= 500;
		
		if(N < A)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}

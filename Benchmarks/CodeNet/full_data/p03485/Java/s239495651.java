import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if((a + b) % 2 == 0)
			System.out.println((a + b)/2);
		else if ((a + b) % 2 == 1)
			System.out.println((a + b + 1) / 2);

	}

}

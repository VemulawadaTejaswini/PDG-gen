
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int D = stdIn.nextInt();
		
		if (D == 25)
			System.out.println("christmas");
		else if (D == 24)
			System.out.println("christmas Eve");
		else if (D == 23)
			System.out.println("christmas Eve Eve");
		else if (D == 22)
			System.out.println("christmas Eve Eve Eve");
				
	}

}

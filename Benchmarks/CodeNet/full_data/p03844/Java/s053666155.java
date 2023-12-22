import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String s = scanner.next();
		int b = scanner.nextInt();

		if(s.equals("+")){
			System.out.println(a+b);
		}else{
			System.out.println(a-b);
		}
	}
}
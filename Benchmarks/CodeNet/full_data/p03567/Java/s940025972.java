import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		if(str.contains("AC")){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}


}
import java.util.Scanner;

public class Main {
	public static void main(String ...args) {
		try(Scanner scanner = new Scanner(System.in)){
			
			int count = scanner.nextInt();
			if(count >= 100 && count <= 999) System.out.println("ABC" + count);
		}
	}
}
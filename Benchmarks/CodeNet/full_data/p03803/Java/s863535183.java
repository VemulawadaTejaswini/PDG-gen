import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if(a > b){
			if(b == 1){
				System.out.println("Bob");
			}else{
				System.out.println("Alice");
			}
		}else if (a < b){
			if(a == 1){
				System.out.println("Alice");
			}else {
				System.out.println("Bob");
			}
		}else {
			System.out.println("Draw");
		}
	}
}

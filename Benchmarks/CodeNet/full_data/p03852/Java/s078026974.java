import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();

		if(string.equals("a") || string.equals("i") || string.equals("u") || string.equals("e") || string.equals("o")){
			System.out.println("vowel");
		}else{
			System.out.println("consonant");
		}
	}
}
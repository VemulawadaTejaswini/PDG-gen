import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String output = new String();

		for(int i = 0,len = input.length(); i < len;i+=2) {
			output = output.concat(String.valueOf(input.charAt(i)));
		}
		
		System.out.print(output);

		scanner.close();
	}

}
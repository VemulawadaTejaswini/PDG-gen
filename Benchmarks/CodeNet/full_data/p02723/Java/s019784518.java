import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] input_str = str.split("");
		if ( (input_str[2].equals(input_str[3])) && (input_str[4].equals(input_str[5]))){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

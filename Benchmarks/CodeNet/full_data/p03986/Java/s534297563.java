import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String string = in.nextLine();
		while(string.contains("ST")){
			string = string.replace("ST", "");
		}
		System.out.println(string.length());
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		String out = "";
		for(int i = 0; i < str.length(); i++) {
			out += "x";
		}
		System.out.println(out);
		scan.close();
	}

}

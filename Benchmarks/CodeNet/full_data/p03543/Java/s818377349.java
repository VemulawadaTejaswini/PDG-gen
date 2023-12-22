
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		String[] list = n.split("");
		String answer = "No";
		if(list[0].equals(list[1]) && list[0].equals(list[2])) {
				answer = "Yes";
		}else if(list[1].equals(list[2]) && list[1].equals(list[3])){
				answer = "Yes";
		}

		System.out.println(answer);
	}
}

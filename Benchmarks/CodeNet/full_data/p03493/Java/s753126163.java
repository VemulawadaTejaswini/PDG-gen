import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		int count = 0;
		for(int i = 0; i < n.length(); i++) {
			if(n.charAt(i) == '1') count++;
		}
		System.out.println(count);
	}

}
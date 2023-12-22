import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String n = kb.next();
		if (n.contains("7")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		kb.close();
	}

}

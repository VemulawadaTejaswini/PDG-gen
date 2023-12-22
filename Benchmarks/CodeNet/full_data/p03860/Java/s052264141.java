import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.nextLine().split(" ");
		System.out.println("A"+s[1].substring(0,1)+"C");
	}

}
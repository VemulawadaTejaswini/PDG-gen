import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char b = scan.next().charAt(0);
		scan.close();
		if(b=='A'||b=='T')System.out.println((b=='A')? "T":"A");
		else System.out.println((b=='C')? "G":"C");
	}
}
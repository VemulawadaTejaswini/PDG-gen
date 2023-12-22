import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String imp = scan.next();
		switch (imp) {
		case "A":
			System.out.println("T");
			break;
		case "T":
			System.out.println("A");
			break;
		case "C":
			System.out.println("G");
			break;
		case "G":
			System.out.println("C");
		}
	}

}
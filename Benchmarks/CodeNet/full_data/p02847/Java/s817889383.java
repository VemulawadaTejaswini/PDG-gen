import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		switch (S) {
		case "SUN":
			System.out.println("7");
			break;
		case "MON":
			System.out.println("6");
			break;
		case "TUE":
			System.out.println("5");
			break;
		case "WED":
			System.out.println("4");
			break;
		case "THU":
			System.out.println("3");
			break;
		case "FRI":
			System.out.println("2");
			break;
		case "SAT":
			System.out.println("1");
			break;
		}
	}
}
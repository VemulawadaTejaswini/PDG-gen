
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	String s = scan.next();

	boolean b = (s.length() % 2 == 0) ^ (s.charAt(0) == s.charAt(s.length()-1));
	System.out.println(b ? "Second" : "First");
	scan.close();
    }
}

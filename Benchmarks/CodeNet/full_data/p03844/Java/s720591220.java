
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	long A = Long.parseLong(scan.next());
	String op = scan.next();
	long B = Long.parseLong(scan.next());

	long ans = (op.equals("+") ? A+B : A-B);
	System.out.println(ans);
	scan.close();
    }
}

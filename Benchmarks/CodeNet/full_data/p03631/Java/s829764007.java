
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final String N;

    public Main() {
	N = scan.next();
	scan.close();
    }

    public final void answer() {
	System.out.println(N.charAt(0) == N.charAt(2) ? "Yes" : "No");
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final int X;
    private final int t;

    public Main() {
	X = Integer.parseInt(scan.next());
	t = Integer.parseInt(scan.next());

	scan.close();
    }

    public final void answer() {
	int ans = Integer.max(0, X-t);
	System.out.println(ans);
    }
}

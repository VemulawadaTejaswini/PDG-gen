import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private int a;
    private int b;

    public Main() {
	a = Integer.parseInt(scan.next());
	b = Integer.parseInt(scan.next());

	scan.close();
    }

    public final void answer() {

	String ans  = a*b % 2 == 0 ? "Even" : "Odd";
	System.out.println(ans);
	
    }
}

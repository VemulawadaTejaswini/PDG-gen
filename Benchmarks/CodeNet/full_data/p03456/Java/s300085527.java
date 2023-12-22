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
	int tmp = b;

	while(tmp > 0) {
	    tmp = tmp / 10;
	    a = a * 10;
	}

	a = a + b;

	int max = (int)Math.sqrt(a);
	String ans = "No";
	for (int i = 1; i <= max; i++) {
	    if(a % i == 0 && a / i == i) {
		ans = "Yes";
		break;
	    }
	}

	System.out.println(ans);
	
    }
}

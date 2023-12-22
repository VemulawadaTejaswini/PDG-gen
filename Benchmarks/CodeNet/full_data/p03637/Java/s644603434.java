
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private int N;
    private int[] count;

    public Main() {
	N = Integer.parseInt(scan.next());
	count = new int[3];
	for (int i = 0; i < N; i++) {
	    int a = Integer.parseInt(scan.next());

	    if(a%4 == 0) count[0]++;
	    else if(a%2 == 0) count[1]++;
	    else count[2]++;
	}
	scan.close();
    }

    public final void answer() {
	int hoge = count[2] - count[0];
	String ans = "Yes";

	if(hoge == 1 && count[1] > 0) ans = "No";
	else if(hoge >= 2) ans = "No";

	System.out.println(ans);
    }
}


import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int M = Integer.parseInt(scan.next());

	int count = 0;
	if(2*N >= M) count = M / 2;
	else {
	    count += N;
	    int rest = M - 2 * N;
	    count += rest / 4;
	}

	System.out.println(count);
	scan.close();
    }
}

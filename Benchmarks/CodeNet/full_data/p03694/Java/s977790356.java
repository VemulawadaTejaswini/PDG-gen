
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int min = 1000;
	int max = 0;

	for (int i = 0; i < N; i++) {
	    int a = Integer.parseInt(scan.next());
	    min = (a < min ? a : min);
	    max = (a > max ? a : max);
	}

	System.out.println(max-min);
	scan.close();
    }
}

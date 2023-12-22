
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int X = Integer.parseInt(scan.next());

	int count = 0;
	int i = 1;
	while(X > 0) {
	    count++;
	    X -= i;
	    i++;
	}

	System.out.println(count);
	scan.close();
    }
}

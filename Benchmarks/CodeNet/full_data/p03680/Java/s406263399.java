
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static int N;
    private static int[] a;
    private static int count = 0;

    public static void main(String[] args) {
	N = Integer.parseInt(scan.next());
	a = new int[N];

	for (int i = 0; i < N; i++) {
	    int index = Integer.parseInt(scan.next()) - 1;
	    a[i] = index;
	}

	System.out.println(check(0) ? count : -1);
	scan.close();
    }

    private static boolean check(int index) {
	if(count >= N) return false;

	count++;
	return a[index] == 1 ? true : check(a[index]);
    }
}

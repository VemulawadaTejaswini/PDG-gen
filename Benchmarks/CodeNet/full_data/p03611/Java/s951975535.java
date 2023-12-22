
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private static final int MAX = 100000;
    private final int[] count;

    public Main() {
	count = new int[MAX+1];
	
	int N = Integer.parseInt(scan.next());
	for (int i = 0; i < N; i++) {
	    int a = Integer.parseInt(scan.next());
	    count[a]++;
	}

	scan.close();
    }

    public final void answer() {
	int[] result = new int[MAX+1];
	for (int i = 0; i <= MAX; i++) {
	    result[i] =  count[i];
	    if(i > 0) result[i] += count[i-1];
	    if(i < MAX) result[i] += count[i+1];
	}

	Arrays.sort(result);
	System.out.println(result[MAX]);
    }
}
